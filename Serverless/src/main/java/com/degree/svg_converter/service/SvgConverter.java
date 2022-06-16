package com.degree.svg_converter.service;

import com.degree.svg_converter.entity.Image;
import jankovicsandras.imagetracer.ImageTracer;

public class SvgConverter {
    public static String ConvertToSvg(Image imageData) {
        return ImageTracer.ConvertToSvg(imageData.getArgs(), imageData.getEncodedImage());
    }
}
