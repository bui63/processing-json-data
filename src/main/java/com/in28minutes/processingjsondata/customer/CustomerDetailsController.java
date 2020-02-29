package com.in28minutes.processingjsondata.customer;

import com.in28minutes.processingjsondata.customer.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CustomerDetailsController {

     @Autowired
     CustomerDetailsService customerDetailsService;

     @GetMapping("/cusomer-details")
     public Customer customerDetails() throws IOException {
          Customer customer = customerDetailsService.retriveCustomerDetails();
          return customer;
     }

     @GetMapping("/new-cusomer-details")
     public com.in28minutes.processingjsondata.customer.payload.Customer newCustomerDetails() throws IOException {
          com.in28minutes.processingjsondata.customer.payload.Customer customer = customerDetailsService.retriveAndModifiyCustomerDetails();
          return customer;
     }
}
