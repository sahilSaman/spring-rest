package com.spring.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public Person filtering() {
        return new Person("sahil", 25, "immco");

    }

    @GetMapping("/filtering-dynamic")
    public MappingJacksonValue dynamicFiltering() {
        Person person = new Person("sahil", 25, "immco");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(person);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "age");
        FilterProvider filters = new SimpleFilterProvider().addFilter("personfilter", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list")
    public List<Person> filteringList() {
        return Arrays.asList(new Person("sahil", 25, "immco"), new Person("arun", 25, "immco"));

    }
}
