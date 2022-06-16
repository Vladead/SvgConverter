package com.degree.svg_converter.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.degree.svg_converter.entity.Image;
import com.degree.svg_converter.service.SvgConverter;

public class LambdaMethodHandler implements RequestHandler<Image, String> {
    public String handleRequest(Image input, Context context) {
        return SvgConverter.ConvertToSvg(input);
    }
}
