package algocom_p2;

import java.util.ArrayList;
import java.util.Collections;

public class Algocom_P2 {

    /**
     * @param args the command line arguments
     */
 //item number 1
    public static void analyze (String input) {           
        input = input.toUpperCase();
        input = input.replaceAll("[^a-zA-Z-]", "");
        ArrayList<Integer> count = new ArrayList<Integer>();
        ArrayList<Character> charList = new ArrayList<Character>();
   
        int found=1;
        char temp;
     
        for (int j=0;j<input.length();j++)
        {
            temp=input.charAt(j);
            
            for(int k = j+1;k<input.length();k++)
            {   if( temp == input.charAt(k))
                {
                    found++;
                    input = input.substring(0,k) + input.substring(k+1,input.length());
                    k--;
                    
                }
            }   
           
            count.add(found);
            charList.add(temp);
            found = 1;
        }
        
       for(int l=0; l < count.size(); l++){  
                 for(int m=1; m < count.size()-1; m++){  
                          if(count.get(m) > count.get(m+1)){  
                                 Collections.swap(count,m,m+1);
                         }  
                          
                 }  
         }
       
       for (int x =0;x<count.size();x++)
           System.out.println(count.get(x));
    }
    
    //item number 2
    public static void countSwaps (int length, int[] carriageNumbers) {   

    //put your code here and the print statements for the output.
        long optimalCount = 0;
		
		for(int x = 1; x < length; x++) {
			
			for(int y = 0; y < length - x; y++) {
				
				//perform swap
				if(carriageNumbers[y] > carriageNumbers[y+1]) {
					carriageNumbers[y] = carriageNumbers[y] + carriageNumbers[y+1]; 
					carriageNumbers[y+1] = carriageNumbers[y] - carriageNumbers[y+1];
					carriageNumbers[y] = carriageNumbers[y] - carriageNumbers[y+1];
					optimalCount++;
				}
			}
		}
		
		System.out.println("The most optimal train swaps: " + optimalCount);
    }
    
    //item number 3
    public static void checkHarvest (int numVillages, int costToFeed, int[] harvests) {   
        long total = numVillages * costToFeed;
	long food = 0;
		   
	for(int i = 0; i < harvests.length; i++) {
            food = food  + harvests[i];
	}
		
	if(food == total)
            System.out.println("JUST ENOUGH FOR EVERYONE");
	else if(food > total)
                System.out.println("PARTY!");
            else
		System.out.println("NOT ENOUGH FOOD");
    }
    
    //item number 4
    public static void printCombination (int N, int K) {   

    //put your code here and the print statements for the output.
        
    }
    
    public static void main(String[] args) {
//1
         analyze("Count me 1 2 3 4 5! Wow! I love ALGOCOM!");
	


//#3 of the assignment
        
        int[] har = new int[6];
        
        har[0] = 1500;
        har[1] = 0;
        har[2] = 500;
        har[3] = 0;
        har[4] = 500;
        har[5] = 0;
//        for(int i = 0; i < 10; i++) {
//            har[i] = 10000000;
//	}
       checkHarvest(5, 500, har);
    }
}
