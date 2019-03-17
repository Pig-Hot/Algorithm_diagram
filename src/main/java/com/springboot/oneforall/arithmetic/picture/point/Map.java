package com.springboot.oneforall.arithmetic.picture.point;

public class Map {
    //记录上一个父亲位置
    private int preX;
    private int preY;
    //记录权值
    private int price;

    public Map() {
        preX = 0;
        preY = 0;
        price = 0;
    }

    public int getPreX() {
        return preX;
    }

    public void setPreX(int preX) {
        this.preX = preX;
    }

    public int getPreY() {
        return preY;
    }

    public void setPreY(int preY) {
        this.preY = preY;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
