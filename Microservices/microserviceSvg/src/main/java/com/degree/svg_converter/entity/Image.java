package com.degree.svg_converter.entity;

public class Image implements java.io.Serializable {
    private String encodedImage;
    private String[] args;

    public Image() {
        setEncodedImage("");
        setArgs(new String[]{});
    }

    public String getEncodedImage() {
        return encodedImage;
    }

    public void setEncodedImage(String encodedImage) {
        this.encodedImage = encodedImage;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }
}
