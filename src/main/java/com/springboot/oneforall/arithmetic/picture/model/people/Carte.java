package com.springboot.oneforall.arithmetic.picture.model.people;

import com.springboot.oneforall.arithmetic.picture.model.People;

import java.util.ArrayList;
import java.util.List;

public class Carte extends People {
    private static Carte carte = new Carte();
    private Carte(){
        this.name = "Carte";
        this.profession = "mid";
        List<People> peoples = new ArrayList<>();
        peoples.add(Aich.getInstance());
        peoples.add(Dema.getInstance());
        this.friend = peoples;
    }
    public static Carte getInstance(){
        return carte;
    }
}
