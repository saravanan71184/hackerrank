package wkofcode28;

import java.util.*;

public class acidnames {

    static String acidNaming(String acid_name) {
        String result = "" ;
        int length_of_string = acid_name.length() ;
        
        if(acid_name.length() >= 7 && 
        	acid_name.substring(0,5).equalsIgnoreCase("hydro") && 
        		acid_name.substring((length_of_string-2),length_of_string).equalsIgnoreCase("ic")){
         result = "non-metal acid" ;  
        }else if(acid_name.substring((length_of_string-2) ,length_of_string).equalsIgnoreCase("ic")){
         result = "polyatomic acid" ;   
        }else{
         result = "not an acid" ;   
        }
        return result ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}

