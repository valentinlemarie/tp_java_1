package com.company;


public class Counter {
    int position,step;
    Counter(int p , int s){
        this.position =p ;
        this.step = s ;
    }

    Counter(int p){
        this(p ,1);
    }
    Counter(){};

    void init(int initPos , int s){
        position = initPos;
        step = s ;
    }

    void count (){
        position+=step;
    }

    int getPosition(){
        return position;
    }

    void count2(){
        int position = this.position;
        position+=step;
        this.position = position;
    }
}
