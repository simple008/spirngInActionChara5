package com.pizza.flow;

import com.pizza.domain.Customer;
import com.pizza.service.CustomerNotFoundException;
import com.pizza.service.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class PizzaFlowActions {
//    private static final LOGGER logger = getLogger(PizzaFlowActions.class);
        public  Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
            Customer customer = CustomerService.lookupCustomer(phoneNumber);
            if(customer != null){
                return customer;
            }else{
                throw new CustomerNotFoundException;
            }
        }
}
