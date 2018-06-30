package sar;



class rockpapscis {    
	
    public static int solution(String FRANK) {
        int result = 0 ;
        FRANK = "RPS" ;
        String GIO = "RSPRS" ;
        int frankSelectR = 0 ;
        int frankSelectP = 0 ;
        int frankSelectS = 0 ;
      
        
        for(int i =0 ; i<FRANK.length(); i++){
        	 System.out.println("G.substring(i)" + FRANK.substring(i, i+1)  ); 
        		for(int j =0 ; j<GIO.length(); j++){
        			System.out.println("F.substring(j)" + GIO.substring(j, j+1)  );
        			if( GIO.substring(j, j+1).equalsIgnoreCase("R") && FRANK.substring(i, i+1).equalsIgnoreCase("R") ) {
        				frankSelectR = frankSelectR + 1 ;
        			}else if(  GIO.substring(j, j+1).equalsIgnoreCase("P") && FRANK.substring(i, i+1).equalsIgnoreCase("P") ) {
        				frankSelectP = frankSelectP +1 ;
        			}else if(GIO.substring(j, j+1).equalsIgnoreCase("S")  && FRANK.substring(i, i+1).equalsIgnoreCase("S") ) {
        				frankSelectS = frankSelectS +1 ;
        			}else if(GIO.substring(j, j+1).equalsIgnoreCase("S") && FRANK.substring(i, i+1).equalsIgnoreCase("R")  ) {
        				frankSelectR = frankSelectR +2 ;
        			}else if(GIO.substring(j, j+1).equalsIgnoreCase("P") && FRANK.substring(i, i+1).equalsIgnoreCase("R")  ) {
        				frankSelectR = frankSelectR + 0 ;
        			}if(GIO.substring(j, j+1).equalsIgnoreCase("S") && FRANK.substring(i, i+1).equalsIgnoreCase("P")  ) {
        				frankSelectP = frankSelectP + 0 ;
        			}if(GIO.substring(j, j+1).equalsIgnoreCase("R") && FRANK.substring(i, i+1).equalsIgnoreCase("P") ) {
        				frankSelectP = frankSelectP + 2 ;
        			}if(GIO.substring(j, j+1).equalsIgnoreCase("R") && FRANK.substring(i, i+1).equalsIgnoreCase("S")  ) {
        				frankSelectS = frankSelectS + 0 ;
        			}if(GIO.substring(j, j+1).equalsIgnoreCase("P") && FRANK.substring(i, i+1).equalsIgnoreCase("S")  ) {
        				frankSelectS = frankSelectS + 2 ;
        			}
        			
        			 System.out.println("frankSelectR "+frankSelectR  ); 
        			 System.out.println("frankSelectP "+frankSelectP  ); 
        			 System.out.println("frankSelectS "+frankSelectS  ); 
        	}        
        		              	
        }
        
        int[] array = new int[3] ;
        array[0] = frankSelectR ;
        array[1] = frankSelectP ;
        array[2] = frankSelectS ;
        System.out.println("array[0]  : "+array[0]  ); 
        System.out.println("array[1]  : "+array[1]  ); 
        System.out.println("array[2]  : "+array[2]  ); 
        
        for(int k =0 ; k<array.length ; k++) {
        		if(result < array[k]) {
        			result = array[k] ;
        		}
        }
        
        System.out.println("result : "+result ); 
        return result ;
    }

    	public static void main(String[] args) {
    		
    		int rrr = solution("SRR") ;
    		System.out.println(rrr); 
    	}

    
    }
    