package com.driver;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
    public static class Product{
        int product(int a,int b){
            int c = a*b;
            return c;
        }
         int product(int a,int b,int c){
            int d = a*b*c;
            return d;
        }
         double product(double a,double b){
            double ans = a*b;
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println(p.product(1,2));
        System.out.println(p.product(2,3,4));
        System.out.println(p.product(1.2,3.4));
    }
}