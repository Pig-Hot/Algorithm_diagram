package com.springboot.oneforall.arithmetic.picture.model.people;

import com.springboot.oneforall.arithmetic.picture.model.People;

import java.util.ArrayList;
import java.util.List;

public class Hulu extends People {
    private static Hulu hulu = new Hulu();
    private Hulu(){
        this.name = "Hulu";
        this.profession = "adc";
        List<People> peoples = new ArrayList<>();
        peoples.add(Aich.getInstance());
        peoples.add(Gulu.getInstance());
        peoples.add(Annie.getInstance());
        peoples.add(ZinZhao.getInstance());
        this.friend = peoples;
    }
    public static Hulu getInstance(){
        return hulu;
    }
}
