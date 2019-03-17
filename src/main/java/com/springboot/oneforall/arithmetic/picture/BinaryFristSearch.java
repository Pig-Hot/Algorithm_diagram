package com.springboot.oneforall.arithmetic.picture;

import com.springboot.oneforall.arithmetic.picture.model.People;
import com.springboot.oneforall.arithmetic.picture.model.people.Carte;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class BinaryFristSearch {
    public static People binaryFristSearch(People people) {
        List<People> searchedPeople = new ArrayList<>();
        ArrayBlockingQueue<People> queue = new ArrayBlockingQueue<>(100);
        StringBuffer sb = new StringBuffer();
        queue.add(people);
        while (queue.size() != 0) {
            try {
                people = queue.take();
                sb.append(people.name + " -> ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!searchedPeople.contains(people)) {
                if (people.profession.equals("jug")) {
                    System.out.println(sb);
                    return people;
                } else {
                    for (People people1:people.friend){
                        if(!searchedPeople.contains(people1) && people1!=null && !queue.contains(people1)){
                            queue.add(people1);
                        }
                    }
                    searchedPeople.add(people);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        People people = binaryFristSearch(Carte.getInstance());
        System.out.println(people.name);
    }
}
