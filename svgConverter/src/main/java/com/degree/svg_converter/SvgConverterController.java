package com.degree.svg_converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SvgConverterController {
    @GetMapping("test/hello")
    public String getHello() {
        return "Hello from svg converter controller";
    }
}
