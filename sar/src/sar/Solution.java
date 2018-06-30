package sar;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
 
public class Solution {
    interface CustomerPurchase {
        String getCustomerId();
        String getProductCategory();
    }
    
    
    static int countExclusiveCustomers(List<CustomerPurchase> customerPurchases) {
		return 0;

//		for( CustomerPurchase cddd ){
//        	System.out.println("test");
//            
//        }
    }
    
    
    public static void main(String[] args) throws IOException{
    	String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/amazontest";
    	File file = new File(filename);
        Scanner in = new Scanner(file);
      
   
        final List<CustomerPurchase> _customerPurchases = new ArrayList<>();
        while (in.hasNext()) {
            _customerPurchases.add(_createCustomerPurchase(in.nextLine()));
        }        
        
        int res = countExclusiveCustomers(_customerPurchases);
        BufferedWriter bw = null;
        bw.write(String.valueOf(res));
        bw.newLine();
        
        bw.close();
    }
 
    private static CustomerPurchase _createCustomerPurchase(String line) {
        final String[] split = line.split(" ");
        if (split.length != 2) {
            return null;
        }
        return new CustomerPurchase() {
            @Override
            public String getCustomerId() {
                return split[0];
            }
            
            @Override
            public String getProductCategory() {
                return split[1];
            }
        };
    }
}
