package com.degree.svg_converter.controller;

import com.degree.svg_converter.service.SvgConverter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class SvgConverterController {
    @GetMapping("hello")
    public String getHello() {
        return "Hello from svg converter controller";
    }

    @GetMapping("get-svg")
    @ResponseBody
    public String getSvg(@RequestParam String imageData) {
        return SvgConverter.ConvertToSvg(imageData);
    }

    @GetMapping("test/test-svg")
    @ResponseBody
    public String getTestSvg(@RequestParam String encodedImage) {
        return SvgConverter.TestConvertToSvg(encodedImage);
    }
}
