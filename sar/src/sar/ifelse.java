package sar;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ifelse {

        public static void main(String[] args) {

            int[] i = new int[]{2, 3, 4, 5 , 6,7, 8, 20, 21, 22};
            String ans="";
            for(int n: i){
            if(n%2==1){
              ans = "Weird";
            }
            else{
             if(((n>=2) && (n<=5))){
            
              ans = "not Weird";
                
            }else if(((n>=6) && (n<=20))){
            ans = "Weird";
            }else if ((n>20)){
                
                ans = "not weird";
            }
            }
            System.out.println(n +","+ans);
            }
        }
    }


