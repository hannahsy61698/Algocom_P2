package algocom_p2;

import java.util.ArrayList;

public class Algocom_P2 {

    /**
     * @param args the command line arguments
     */
 
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
    
    public static void checkHarvest (int numVillages, int costToFeed, int[] harvests) {   
        if((numVillages >= 1 && numVillages <= 1000000) && (costToFeed >= 1 && costToFeed <= 5000)){
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
    }
   
    public static void printCombination (int N, int K) { 
        if((N >= 1 && N <= 20) && (K >= 1 && N >= K)){
            int[] all = new int[N];
            int[] temp = new int[N];

            for(int i = 0; i < N; i++){
                all[i] = i + 1;
            }

            Combination(all, temp, 0, N, 0, K);
        }
    }
    
    public static void Combination(int[] allnum, int[] temp, int s, int e, int index, int K){
        if(index == K){
            for(int i = 0; i < K; i++){
                System.out.print(temp[i] + " ");
            }
            System.out.println();
        }else{
            for(int i = s; i < e; i++){
                temp[index] = allnum[i];
                Combination(allnum, temp, i+1, e, index + 1, K);
            }
        }
    }
    
    public static void main(String[] args) {
          int [] val = {1500, 0, 500, 0, 500, 0};
          int[] swap = {1,2,4,3};
        //1
          analyze("abcdefghijklmnop123456789");
        //2
        //countSwaps(4,swap);
        //3    
        //checkHarvest(5, 500, val);
        //4
        //printCombination(4,3);
    }
}
