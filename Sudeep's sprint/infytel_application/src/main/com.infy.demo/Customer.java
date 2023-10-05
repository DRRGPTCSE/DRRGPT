package com.infy.demo; 
    
public class Customer { 
     private String customerName; 
     public String getCustomerName() { 
        return customerName; 
     } 
     public void setCustomerName(String customerName) { 
        this.customerName = customerName; 
     } 
     public String registerCustomer(String name){ 
        return "Welcome "+ name+"! You are now our registered user!!"; 
     } 
}