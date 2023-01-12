package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p=new Product();
        p.product(1,1);
        p.product(1,1,1);
        p.product(1.00,1.00);
    }
}
 class Product{
    public int product(int x,int y){
        return x*y;
    }
     public int product(int x,int y,int z){
         return x*y*z;
     }
     public int product(double x,double y){
          return (int)(x*y);
     }
}