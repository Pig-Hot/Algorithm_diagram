package com.springboot.oneforall.arithmetic.picture.model;

import com.springboot.oneforall.arithmetic.picture.model.People;
import com.springboot.oneforall.arithmetic.picture.model.people.Gulu;

import java.util.*;

public class DepthFirstSearch {
    private static StringBuffer path = new StringBuffer();
    private static Set<People> searchedPeople = new HashSet<>();
    private static Stack<People> stack = new Stack<>();
    private static void depthFristSearch(People people) {
        stack.push(people);
        while (!stack.isEmpty()){
            people = stack.pop();
            path.append(people.name).append(" ").append(" -> ");
            if (!searchedPeople.contains(people)) {
                for (People people1:people.friend){
                    searchedPeople.add(people);
                    if(!searchedPeople.contains(people1) && people1!=null && !stack.contains(people1)){
                        depthFristSearch(people1);
                    }
                }
            }
        }
    }
    public static void print(){
        depthFristSearch(Gulu.getInstance());
        System.out.println(path);
    }

    public static void main(String[] args) {
        print();
    }
}
