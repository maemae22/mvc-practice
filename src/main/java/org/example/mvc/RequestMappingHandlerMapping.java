package org.example.mvc;

import org.example.controller.Controller;
import org.example.controller.HomeController2;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
//    [key] : url Path (ex. /users)     [value] : Controller 이름 (ex. UserController)
    private Map<String, Controller> mappings = new HashMap<>();

    void init() {
        mappings.put("/", new HomeController2());
    }

    public Controller findHandler(String uriPath) {
        return mappings.get(uriPath);
    }
}
