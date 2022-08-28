package com.example.picturegallery;

import java.io.Serializable;

public class Artist implements Serializable {

    String artistName;
    String imageName;
    int img;

    Artist(String artistName,String imageName,int img){
        this.artistName = artistName;
        this.imageName = imageName;
        this.img = img;
    }

}
