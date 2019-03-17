package com.springboot.oneforall.arithmetic.picture.model.people;

import com.springboot.oneforall.arithmetic.picture.model.People;

import java.util.ArrayList;
import java.util.List;

public class Aich extends People {
    private static Aich aich = new Aich();
    private Aich(){
        this.name = "Aich";
        this.profession = "adc";
        List<People> peoples = new ArrayList<>();
        peoples.add(Annie.getInstance());
        peoples.add(Carte.getInstance());
        peoples.add(Hulu.getInstance());
        peoples.add(Gulu.getInstance());
        this.friend = peoples;
    }
    public static Aich getInstance(){
        return aich;
    }
}
