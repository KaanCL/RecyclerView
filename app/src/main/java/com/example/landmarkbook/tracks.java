package com.example.landmarkbook;

import java.io.Serializable;

public class tracks implements Serializable {
    String name ;
    String country;
    int image;

    public tracks(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
