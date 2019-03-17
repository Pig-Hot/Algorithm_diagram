package com.springboot.oneforall.arithmetic.picture.model.people;

import com.springboot.oneforall.arithmetic.picture.model.People;

import java.util.ArrayList;
import java.util.List;

public class MunDo extends People{
    private static MunDo munDo = new MunDo();
    private MunDo(){
        this.name = "MunDo";
        this.profession = "top";
        List<People> peoples = new ArrayList<>();
        peoples.add(Gulu.getInstance());
        peoples.add(ZinZhao.getInstance());
        this.friend = peoples;
    }
    public static MunDo getInstance(){
        return munDo;
    }
}
