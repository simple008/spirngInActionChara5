package spittr.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.*;
import javax.sql.rowset.serial.SerialException;

public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        Registration.Dynamic myServlet = servletContext.addServlet("myServlet", MyServlet.class);
        ((ServletRegistration.Dynamic) myServlet).addMapping("/custom/**");
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException{
        FilterRegistration.Dynamic filter = servletContext.addFilter("myFilter", MyFilter.class);
        filter.addMappingForUrlPatterns(null, false, "/custom/*");
    }

    @Override
    protected Filter[] getServletFilters(){
        return Filter[] {new MyFilter()};
    }
}
