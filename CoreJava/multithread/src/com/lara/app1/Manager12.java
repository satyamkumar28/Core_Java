
package com.lara.app1;

class H extends Thraed{
    
    public void run(){
        for(int i=0;i<1000;i++){

            System.out.println(i);
        }
    }
}

public class Manager12{

    public static void main(String args[]){

        H h1=new H();
        h1.start();
        System.out.println("------------------");

        h1.start();
        System.out.println("Done");
    }
}