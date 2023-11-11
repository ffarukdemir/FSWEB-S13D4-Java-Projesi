package com.workintech.model;


public class Main {

    public static void main(String[] args){
        Point first= new Point(6,5);
        Point second= new Point(3,1);

        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2,2));

        Player ali =new Player("ali", 100, Weapon.AXE) ;
        ali.loseHealt(120);

        System.out.println(ali);

    }
}
