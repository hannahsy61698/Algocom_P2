package algocom_p2;

public class Algocom_P2 {
    
    public static void checkHarvest (int numVillages, int costToFeed, int[] harvests) {
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
		
	checkHarvest(5, 500, har);
    }
}
