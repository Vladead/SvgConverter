package com.degree.svg_converter.controller;

import jankovicsandras.imagetracer.ImageTracer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class SvgConverterController {
    @GetMapping("test/hello")
    public String getHello() {
        return "Hello from svg converter controller";
    }

    @GetMapping("test/test_svg")
    @ResponseBody
    public String getTestSvg(@RequestParam String encodedImage) {
        return ImageTracer.ConvertToSvg(new String[]{}, encodedImage);
    }
}
