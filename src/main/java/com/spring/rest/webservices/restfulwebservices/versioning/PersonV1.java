package com.spring.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {
    private String name;

    @Override
    public String toString() {
        return "PersonV1 [name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    public PersonV1(String name) {
        super();
        this.name = name;
    }

}
