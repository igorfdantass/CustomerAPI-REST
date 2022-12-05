package com.ada.crm.exceptionhandler;

import lombok.Data;

import java.util.Date;

@Data
public class MessageExceptionHandler {
    private Date timestamp;
    private Integer status;
    private String message;
}

//TODO: Criar classe ProductControllerAdvice
//TODO: Alterar código do controller com arrow function para lançar o CustomerFoundException
//TODO: Testar no postman
//TODO: Criar um package "services" e colocar lá os métodos findByID, findAll, createCustomer, deleteCustomer
//TODO: Adicionar dependencia e fazer um novo tratamento de exceções, agora para validação de campos not null
// todos disponíveis em: https://www.linkedin.com/pulse/tratando-erros-e-exce%C3%A7%C3%B5es-com-spring-boot-tiago-perroni/?originalSubdomain=pt