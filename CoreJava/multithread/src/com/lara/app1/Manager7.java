package com.lara.app1;

class MyRunnable implements Runnable{

    public void run(){

        for(int i=0;i<1000;i++){

            System.out.println(i);
        }
    }
}

public class Manager7{

    public static void main(String args[]){

        MyRunnable mr=new MyRunnable();
        Thread t1=new Thread(mr);
        t1.start();
        for(int i=2000;i<3000;i++){

            System.out.println(i);
        }
    }
}