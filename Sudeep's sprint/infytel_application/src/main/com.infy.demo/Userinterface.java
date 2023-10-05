package com.infy.demo; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext; 
import com.infy.config.SpringConfig; 
public class UserInterface { 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
ApplicationContext applicationContext = newAnnotationConfigApplicationContext(SpringConfig.class);
        Customer customer = applicationContext.getBean(Customer.class); 
        customer.setCustomerName("Uday Shankar"); 
        System.out.println(customer.registerCustomer(customer.getCustomerName())); 
        } 
}