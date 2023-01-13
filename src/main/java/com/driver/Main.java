package com.driver;

import java.util.Scanner;

public class Main {
   public  static class Product{
         public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }

    public static void main(String[] args) {

        Product p = new Product();
        System.out.println(p.product(10,20));
        System.out.println(p.product(10,20,30));
        System.out.println(p.product(20.0,30.0));
    }
}
