package com.springboot.oneforall.arithmetic.picture.model.people;

import com.springboot.oneforall.arithmetic.picture.model.People;

import java.util.ArrayList;
import java.util.List;

public class ZinZhao extends People {
    private static ZinZhao zinZhao = new ZinZhao();
    private ZinZhao(){
        this.name = "ZinZhao";
        this.profession = "jug";
        List<People> peoples = new ArrayList<>();
        peoples.add(Hulu.getInstance());
        peoples.add(MunDo.getInstance());
        peoples.add(Dema.getInstance());
        this.friend = peoples;
    }
    public static ZinZhao getInstance(){
        return zinZhao;
    }
}
