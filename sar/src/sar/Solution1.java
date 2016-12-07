package sar;

import java.io.*;
import java.util.*;
import java.util.HashMap;

public class Solution1 {

    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    
        String A=sc.next();
        String B=sc.next();
        int ale = A.length();
        int ble = B.length();
        String  A_firstletter =  A.substring(0, 1).toUpperCase() ;
        String  B_firstletter =  B.substring(0, 1).toUpperCase() ;
        A = A.replace(A.substring(0, 1), A.substring(0, 1).toUpperCase());
        B = B.replace(B.substring(0, 1), B.substring(0, 1).toUpperCase());
        
        HashMap<String, String> intStringvalue = new HashMap<String, String>();
        
        intStringvalue.put("A", "1");
        intStringvalue.put("B", "2");
        intStringvalue.put("C", "3");
        intStringvalue.put("D", "4");
        intStringvalue.put("E", "5");
        intStringvalue.put("F", "6");
        intStringvalue.put("G", "7");
        intStringvalue.put("H", "8");
        intStringvalue.put("I", "9");
        intStringvalue.put("J", "10");
        intStringvalue.put("K", "11");
        intStringvalue.put("L", "12");
        intStringvalue.put("M", "13");
        intStringvalue.put("N", "14");
        intStringvalue.put("O", "15");
        intStringvalue.put("P", "16");
        intStringvalue.put("Q", "17");
        intStringvalue.put("R", "18");
        intStringvalue.put("S", "19");
        intStringvalue.put("T", "20");
        intStringvalue.put("U", "21");
        intStringvalue.put("V", "22");
        intStringvalue.put("W", "23");
        intStringvalue.put("X", "24");
        intStringvalue.put("Y", "25");
        intStringvalue.put("Z", "26");
        
        int a_value = Integer.valueOf(intStringvalue.get(A_firstletter));
        int b_value = Integer.valueOf(intStringvalue.get(B_firstletter));
        
        System.out.println(ale+ble);
        
        if(a_value > b_value){
            System.out.println("yes");   
        }else{
            System.out.println("no"); 
        }
        
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A+" "+B);
        
    }
}
