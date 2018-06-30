package wkofcode28;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class luckyeight {

static List<BigInteger> subsequencelist = new ArrayList<BigInteger>();
	

    public static void main (String args[]){
    	String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/wkofcode28/likyeight";
		File inpfile = new File(filename);

		Scanner in;
         try {
			in = new Scanner(inpfile);
		
        int n = in.nextInt();
        String number = in.next();
        
        getSubsequenceList("",number);
        
        long numofdiveby8 = 0;
        BigInteger dive = new BigInteger("8");
        BigInteger zero = new BigInteger("0");

        for(int i = 0; i<subsequencelist.size(); i++){

        	//if( (subsequencelist.get(i) > 0) && ((subsequencelist.get(i)% dive) == 0) ){
           // if((subsequencelist.get(i)% dive) == 0){
        	if((subsequencelist.get(i).mod(dive).equals(zero))){
        		numofdiveby8 = numofdiveby8 + 1;
        	}
        	
        }
        

        System.out.println(numofdiveby8 % 1000000007);
         } catch (FileNotFoundException e) {
 			e.printStackTrace();
 		}
        }
	
    public static void getSubsequenceList(String firstchar,String input){

        if(input.length()<0)
        	{
        	return;
        	}
        if(firstchar.length() > 0){
        	BigInteger newval = new BigInteger(firstchar);
        	System.out.println(newval);
        	subsequencelist.add(newval);
        }

        for(int i=0;i<input.length();i++){      
         getSubsequenceList(firstchar+input.charAt(i),input.substring(i+1,input.length()));
        }
        
       
    }



}
