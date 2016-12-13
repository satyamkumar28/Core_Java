
package com.lara.app1;

class J extends Thread{

    public void run(){

        System.out.println("J-begin");
        int i=10/0;
        System.out.println("J-end");
    }
}

class K extends Thread{

    public void run(){

        for(int i=0;i<=1000;i++){

            System.out.println(i);
        }
    }
}

public class Manager14{

    public static void main(String args[]){

        J j1=new J();
        j1.start();

        K k1=new K();
        k1.start();

        for(int i=1000;i<2000;i++){

            System.out.println(i);
        }
    }
}