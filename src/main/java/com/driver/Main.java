package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
      int ans =  p.product(10, 100);
      int ans1=  p.product(10,100,150);
    double ans2= p.product(10d,1000d);
    System.out.print(ans+" "+ ans2+" " +ans1);
    }
    static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
}