package AssignmentFour;

import java.util.Scanner;

public class BattingAverage {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int hit;
		int atBats;
		float battingAverage;
		float sluggingPercentage;
		int totalHits = 0;
		int totalSlug;
		

		System.out.println("Please enter the players name: ");
		String playername = sc.nextLine();

		

		System.out.println("Please enter total at bats: ");
		String stringUserAtBats = sc.nextLine();
		
		atBats = Integer.parseInt(stringUserAtBats);
		int[] inputEachHits = new int[atBats];
		

		for (int i = 0; i < atBats; i++) {
			System.out.println("Enter the result of at bat #" + (i+1));
			String hits = sc.nextLine();
			hit = Integer.parseInt(hits);
			int[] results = new int[hit];	
			
			
			
		
		
		for (int j = 0; j < atBats;j++) {
			
			if(results[j] != 0){
				totalHits++;
			}
			}
System.out.println(totalHits);
		sc.close();
		
		
			
			
		}
		
		
		
		
	}

	
	
}

