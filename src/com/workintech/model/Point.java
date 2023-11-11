package com.workintech.model;

public class Point {
    private int x;

    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getx(){
        return x;
    }

    public void setx(int x){
        this.x=x;
    }

    public int gety(){
        return y;
    }

    public void sety(int y){
        this.y=y;
    }


    public  double distance(){
        return Math.sqrt(getx()*getx()+gety()*gety());
    }

    public double distance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }

    public double distance( int a, int b){
        return Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2));
    }

}
