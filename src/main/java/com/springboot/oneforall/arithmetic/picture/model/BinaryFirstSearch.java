package com.springboot.oneforall.arithmetic.picture.model;

import com.springboot.oneforall.arithmetic.picture.model.People;
import com.springboot.oneforall.arithmetic.picture.model.people.Carte;
import com.springboot.oneforall.arithmetic.picture.model.people.Gulu;
import com.springboot.oneforall.arithmetic.picture.model.people.Hulu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class BinaryFirstSearch {
    public static void binaryFristSearch(People people) {
        StringBuffer path = new StringBuffer();
        HashMap<People,Integer> dist = new HashMap<>();
        List<People> searchedPeople = new ArrayList<>();
        ArrayBlockingQueue<People> queue = new ArrayBlockingQueue<>(100);
        queue.add(people);
        dist.put(people,0);
        while (queue.size() != 0) {
            people = queue.poll();
            path.append(people.name).append(" ").append(dist.get(people)).append(" -> ");
            if (!searchedPeople.contains(people)) {
                    int d = dist.get(people) + 1;
                    for (People people1:people.friend){
                        if(!searchedPeople.contains(people1) && people1!=null && !queue.contains(people1)){
                            dist.put(people1,d);
                            queue.add(people1);
                        }
                    }
                    searchedPeople.add(people);
                }
            }
        System.out.println(path);
    }

    public static void main(String[] args) {
        binaryFristSearch(Hulu.getInstance());
    }
}
