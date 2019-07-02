package algocom_p2;

import java.util.ArrayList;

public class Algocom_P2 {

    /**
     * @param args the command line arguments
     */
 //item number 1
    public static void analyze (String input) {   
/* pao's code
        //put your code here and the print statements for the output.
        
        //make everything uppercase
        input = input.toUpperCase();
        
        //removes all except alphabets
        
        int[] ctr = new int[255];

        int strLength = input.length();

        for(int i = 0; i < strLength; i++){
            ctr[input.charAt(i)]++;
        }
        
        char[] ch = new char[input.length()];
        
        for(int i = 0; i < strLength; i++){
            ch[i] = input.charAt(i);
            
            int found = 0;
            
            for(int j = 0; j <= i; j++){
                if(input.charAt(i) == ch[j]){
                    found++;
                }
            }
            
            if(found == 1){
                System.out.println("" + input.charAt(i) + " " + ctr[input.charAt(i)]);
            }
        }
        
        */
        
        input = input.toUpperCase();
        input = input.replaceAll("[^a-zA-Z-]", "");
        ArrayList<Integer> count = new ArrayList<Integer>();
   
        int found=0;
        char temp;
     
        for (int j=0;j<input.length();j++)
        {
            temp=input.charAt(j);
            
            for(int k = j+1;k<input.length()-1;k++)
            {     
                if( temp == input.charAt(k))
                {
                    found++;
                    input = input.substring(0,k) + input.substring(k+1,input.length());
                    k--;
                }
            }   
            
            if (found != 0)
                found++;
                count.add(found);
                found = 0;
        }
        
        for(int l = 0;l<count.size();l++)
            System.out.println(count.get(l));
        System.out.println(input);
    }
    
    //item number 2
    public static void countSwaps (int length, int[] carriageNumbers) {   

    //put your code here and the print statements for the output.
        
    }
    
    //item number 3
    public static void checkHarvest (int numVillages, int costToFeed, int[] harvests) {   

    //put your code here and the print statements for the output.
     long start = System.currentTimeMillis();
		
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
		   
	long end = System.currentTimeMillis();
		
	double sec = end- start;
		
	System.out.println(start + " - " + end + " = " + sec);
      
    }
    
    //item number 4
    public static void printCombination (int N, int K) {   

    //put your code here and the print statements for the output.
        
    }
    
    public static void main(String[] args) {
        
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
        analyze("Count me 1 2 3 4 5! Wow! I love ALGOCOM!");
	checkHarvest(5, 500, har);
    }
}
