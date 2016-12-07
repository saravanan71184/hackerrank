package sar;

public class MyCalculator implements AdvancedArithmetic
		{
		    public int divisor_sum(int n){
		        int i=1;
		        if(n>1)
		            i=i+n;
		        for(int j=2;j<=(n/2);j++)
		            if(n%j==0)
		             i=i+j;
		        return i;
		    }
		}
	
