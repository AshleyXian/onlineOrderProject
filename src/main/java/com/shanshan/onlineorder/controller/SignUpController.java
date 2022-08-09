package com.shanshan.onlineorder.controller;

import com.shanshan.onlineorder.entity.Customer;
import com.shanshan.onlineorder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SignUpController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED) // same as response.setStatus
    // requestBody: convert json to java object (Customer)
    public void signUp(@RequestBody Customer customer) {
        customerService.signUp(customer);
    }

}
