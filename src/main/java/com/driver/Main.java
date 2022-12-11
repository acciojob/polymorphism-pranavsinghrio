package com.driver;

import java.util.*;
import java.lang.*;

public class Main
{
    public static class Product{
        public int Product(int a, int b){

            return a*b;
        }
         public int Product(int a, int b, int c){
             int i = a * b * c;
             return i;
        }
         public double Product(double a, double b){
            double ans = a*b;
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product();
        System.out.println(p.Product(1,2));
        System.out.println(p.Product(2,3,4));
        System.out.println(p.Product(1.2,3.4));
    }
}