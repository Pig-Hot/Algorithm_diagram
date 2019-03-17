package com.springboot.oneforall.arithmetic.picture.model.people;

import com.springboot.oneforall.arithmetic.picture.model.People;

import java.util.ArrayList;
import java.util.List;

public class Annie extends People {
    private static Annie annie = new Annie();
    private Annie(){
        this.name = "Annie";
        this.profession = "mid";
        List<People> peoples = new ArrayList<>();
        peoples.add(Aich.getInstance());
        peoples.add(Dema.getInstance());
        peoples.add(Hulu.getInstance());
        peoples.add(Gulu.getInstance());
        this.friend = peoples;
    }
    public static Annie getInstance(){
        return annie;
    }
}
