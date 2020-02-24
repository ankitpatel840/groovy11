package com.groovy.groovy;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class TableGenrator
{    @Id
    @Value("${Customer.name}")
    String name;
    @Value("${Customer.state}")
    String state;



}
