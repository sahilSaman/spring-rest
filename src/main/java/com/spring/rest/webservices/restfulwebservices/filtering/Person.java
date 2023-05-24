package com.spring.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

//this is how it add at field level
// @JsonIgnoreProperties("age")

//for dynamic filtering
@JsonFilter("personfilter")
public class Person {
    private String name;
    // to hide the field from all responses
    // @JsonIgnore
    private int age;
    private String company;

    public Person(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", company=" + company + "]";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

}
