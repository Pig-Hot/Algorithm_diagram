package com.springboot.oneforall.arithmetic.picture.model.people;

import com.springboot.oneforall.arithmetic.picture.model.People;

import java.util.ArrayList;
import java.util.List;

public class Gulu extends People {
    private static Gulu gulu = new Gulu();
    private Gulu(){
        this.name = "Gulu";
        this.profession = "sup";
        List<People> peoples = new ArrayList<>();
        peoples.add(Aich.getInstance());
        peoples.add(Hulu.getInstance());
        peoples.add(Annie.getInstance());
        peoples.add(MunDo.getInstance());
        this.friend = peoples;
    }
    public static Gulu getInstance(){
        return gulu;
    }
}
