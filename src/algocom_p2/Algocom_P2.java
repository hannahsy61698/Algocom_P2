package algocom_p2;

public class Algocom_P2 {
    
    public static void checkHarvest (int numVillages, int costToFeed, int[] harvests) {
	long start = System.currentTimeMillis();
		
	int total = numVillages * costToFeed;
	int food = 0;
		   
	for(int i = 0; i < harvests.length; i++) {
            food = food  + harvests[i];
	}
		
	System.out.println(total + " " + food);
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
        int[] har = new int[10000000];
        for(int i = 0; i < 10000000; i++) {
            har[i] = 1000;
	}
		
	checkHarvest(100, 500, har);
    }
}
