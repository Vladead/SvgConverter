package com.degree.svg_converter.service;

import com.degree.svg_converter.entity.Image;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jankovicsandras.imagetracer.ImageTracer;

public class SvgConverter {
    public static String ConvertToSvg(String imageData) {
        try {
            Image image = GetImageData(imageData);
            return ImageTracer.ConvertToSvg(image.getArgs(), image.getEncodedImage());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String TestConvertToSvg(String encodedImage) {
        return ImageTracer.ConvertToSvg(new String[]{}, encodedImage);
    }

    public static Image GetImageData(String svgParameters) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(svgParameters, Image.class);
    }
}
