package com.ada.crm.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@ControllerAdvice(basePackages = "com/ada/crm/controller")
public class CustomerControllerAdvice {

    @ResponseBody
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<MessageExceptionHandler> customerNotFound (CustomerNotFoundException customerNotFound){
        MessageExceptionHandler error = new MessageExceptionHandler(
                new Date(), HttpStatus.NOT_FOUND.value(),"Cliente não cadastrado");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
}
