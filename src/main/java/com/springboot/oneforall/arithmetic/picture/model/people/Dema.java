package com.springboot.oneforall.arithmetic.picture.model.people;

import com.springboot.oneforall.arithmetic.picture.model.People;

import java.util.ArrayList;
import java.util.List;

public class Dema extends People {
    private static Dema dema = new Dema();
    private Dema(){
        this.name = "Dema";
        this.profession = "top";
        List<People> peoples = new ArrayList<>();
        peoples.add(Carte.getInstance());
        peoples.add(ZinZhao.getInstance());
        this.friend = peoples;
    }
    public static Dema getInstance(){
        return dema;
    }
}
