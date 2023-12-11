package com.example.springmvcscopes.beans;


import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
@Data
public class RequestScopeBean {

    private Integer value;
}
