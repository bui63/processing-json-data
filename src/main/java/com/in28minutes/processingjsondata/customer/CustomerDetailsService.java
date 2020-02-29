package com.in28minutes.processingjsondata.customer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.in28minutes.processingjsondata.customer.dto.Customer;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerDetailsService {

    public Customer retriveCustomerDetails() throws IOException {

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
        Customer customer = objectMapper.readValue(new File("D:\\in28minutes\\processing-json-data\\src\\main\\resources\\customer.json"), Customer.class);
        return customer;
    }
    public com.in28minutes.processingjsondata.customer.payload.Customer retriveAndModifiyCustomerDetails() throws IOException {
        List<String> paymentMethod = new ArrayList<>();
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
        Customer customer = objectMapper.readValue(new File("D:\\in28minutes\\processing-json-data\\src\\main\\resources\\customer.json"), Customer.class);
        for (String s: customer.getPaymentMethods()
             ) {
            paymentMethod.add(s);
        }
        return new com.in28minutes.processingjsondata.customer.payload.Customer(customer.getId(),customer.getName(),paymentMethod);
    }
}
