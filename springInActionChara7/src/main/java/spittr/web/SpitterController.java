package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import spittr.Spitter;
import spittr.data.SpitterRepository;
import sun.security.provider.ConfigFile;

import javax.validation.Valid;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
    private SpitterRepository spitterRepository;

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(){
        return "registerForm";
    }

    /*@RequestMapping(value = "/register", method = POST)
    public String processRegisteration(@Valid Spitter spitter, Errors errors){
        if(errors.hasErrors()){
            return "registerForm";
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUserName();
    }*/

    @RequestMapping(value = "/register", method = POST)
    public String processRegisteration(@Valid SpitterForm spitterForm, Errors errors)
    throws IllegalStateException, IOException {
        if(errors.hasErrors()){
            return "registerForm";
        }
        Spitter spitter = spitterForm.toSpitter();

        spitterRepository.save(spitter);
        MultipartFile profilePicture = spitterForm.getProfilePicture();
        profilePicture.transferTo(new File("/tmp/spittr/" + spitter.getUserName()));
        return "redirect:/spitter/" + spitter.getUserName();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showSpitterProfile(@PathVariable String userName, Model model){
        Spitter spitter =spitterRepository.findByUserName(userName);
        model.addAttribute(spitter);
        return "profile";
    }
}
