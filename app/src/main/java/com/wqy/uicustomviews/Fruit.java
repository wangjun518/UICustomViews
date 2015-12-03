package com.wqy.uicustomviews;

/**
 * Created by wqy on 2015/12/2.
 */
public class Fruit {
    private String name;
    private int imageId;
    
    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
