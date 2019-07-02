/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algocom_p2;

/**
 *
 * @author Hannah Sy
 */
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
        input = input.replaceAll("[^a-zA-Z-]", "");
        
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
        
        
    }
    
    //item number 2
    public static void countSwaps (int length, int[] carriageNumbers) {   

    //put your code here and the print statements for the output.
        
    }
    
    //item number 3
    public static void checkHarvest (int numVillages, int costToFeed, int[] harvests) {   

    //put your code here and the print statements for the output.
        
    }
    
    //item number 4
    public static void printCombination (int N, int K) {   

    //put your code here and the print statements for the output.
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        analyze("1 2 3 4 1234 hello world my name is bleh bleh bleh");
    }
    
}    
