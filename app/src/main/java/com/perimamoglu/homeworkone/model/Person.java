package com.perimamoglu.homeworkone.model;

/**
 * Created by testinium on 24/07/2017.
 */

public class Person {
    private String name;
    private String imageText;

    public Person(String name, String imageText) {
        this.name = name;
        this.imageText = imageText;
    }

    public String getName() {
        return name;
    }

    public String getImageText() {
        return imageText;
    }

}
