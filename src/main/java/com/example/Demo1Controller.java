package com.example;

import io.micronaut.http.annotation.*;

@Controller("/demo1")
public class Demo1Controller {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}