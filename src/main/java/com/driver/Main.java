package com.driver;

import java.util.Scanner;

public class Main {
     public static class Product{
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        double u=sc.nextDouble();
        double v=sc.nextDouble();
        Product p=new Product();
        p.product(x,y);
        p.product(x,y,z);
        p.product(u,v);
    }
}
