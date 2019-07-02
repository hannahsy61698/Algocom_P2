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
          for (int x = 0; x < count.size(); x++) 
          {
              for (int y = 0; y < count.size()-1; y++) 
            {
                if (count.get(y) < count.get(y+1)) 
                { 
                    int temp2 = count.get(y); 
                    count.set(y,count.get(y+1)); 
                    count.set(y+1,temp2); 
                    
                    char temp3 = charList.get(y);
                    charList.set(y,charList.get(y+1));
                    charList.set(y+1,temp3);
                }
                else if (count.get(y)==count.get(y+1))
                {
                    if(charList.get(y) > charList.get(y+1))
                    {
                        char temp4 = charList.get(y);
                        charList.set(y,charList.get(y+1));
                        charList.set(y+1,temp4);
                
                    }
                }
            }
          }
      
       for (int z =0;z<count.size();z++)
           System.out.println(charList.get(z) + " " + count.get(z));
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
         analyze("zyxwuvabcdefgkjmon");
	


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
