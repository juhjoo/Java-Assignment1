/**
   Practical Programming Assignment 1
   Class:   Algorithms and Data Structures
   Author:  HyunJu Ju
   Date:    Mar 3152020
 */

import java.util.*;

public class DegreeGrader {
	
	// all module average
	private int all_avg;
	// ISM module average
	private int ism_avg;
	//number of compensentable failed credits
	private int compen_num;
	//number of outright failed modules
	private int outright_num;
	// the grading criteria
	private String degree;
	
    /**
     * Show a note.
     * @param all, ism, compen, outright
     * Methods to get the grading criteria and show the result.
     */
	public void gradeDegree(int all, int ism, int compen, int outright) {
		
		if(all >= 70 && ism >=70 && compen ==0 && outright ==0) {
			degree = "Distinction";
		} else if(all >= 60 && ism >= 60 && compen <= 15 && outright <= 2) {
			degree = "Merit";
		} else if(all >= 50 && ism >= 50 && compen <= 30 && outright <= 2) {
			degree = "Pass";
		} else {
			degree = "Fail";
		}
		
		System.out.println("Your degree is " + degree);
		System.out.println("");
		
	}
	
	public void startDegreeGrading() { 
		// initiate a message 
		String message = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("");
			
			if(message.equals("n")) {
				System.out.println("*********** Finishing Module Grading Program *********");
				// This is "n", so ending grading program
				break;
			} else if(message.equals("y")) {
				System.out.println("*********** Degree Classification Program *********");
				
				// To call getvaildAllavg in order to get all module average
				getvaildAllavg();
				// To call getvaildIsmavg in order to get ISM module average
				getvaildIsmavg();
				// To call getvaildcompenNum in order to get failed credits
				getvaildcompenNum();
				// To call getvaildfailedNum in order to get outright failed modules
				getvaildfailedNum();
				
				System.out.println("1. all module average : " + all_avg);
				System.out.println("2. ISM module average : " + ism_avg);
				System.out.println("3. number of compensentable failed credits : " + compen_num);
				System.out.println("4. number of outright failed modules : " + outright_num);
				
				// To call gradeDegree in order to get the grading criteria
				gradeDegree(all_avg, ism_avg, compen_num, outright_num);
				
				System.out.print("continue grading : yes/no(y/n) : ");
				// This is "y", so ongoing grading program
				message = sc.nextLine();
			} else {
				System.out.println("To validate a input is 'y' or 'n'");
				System.out.print("continue grading : yes/no(y/n) : ");
				message = sc.nextLine();
			}
		}
	}
	
	/*
	 * Show a note.
	 * Methods to get valid all module average.
	 */
	public void getvaildAllavg() {
		
		Scanner sc = new Scanner(System.in);	
		
		while(true) {
		
			System.out.println("To validate all the module averages in the range 0 to 100");
			System.out.print("Input all the module averages : ");
			all_avg = sc.nextInt();
			if(all_avg <= 100 && all_avg >=0) {
				// This is valid number in 0 to 100 
				break;
			}	
			
		}	
	}
	
	/*
	 * Show a note.
	 * Methods to get valid ISM module average
	 */
	public void getvaildIsmavg() {
		
		Scanner sc = new Scanner(System.in);	
		
		while(true) {
		
			System.out.println("To validate an ISM module average in the range 0 to 100");
			System.out.print("Input ISM module average : ");
			ism_avg = sc.nextInt();
			if(ism_avg <= 100 && ism_avg >=0) {
				// This is valid number in 0 to 100 
				break;
			}	
			
		}	
	}
	
	/*
	 * Show a note.
	 * Methods to get valid number of compensentable failed credits
	 */
	public void getvaildcompenNum() {
		
		Scanner sc = new Scanner(System.in);	
		
		while(true) {
		
			System.out.println("To validate a number of compensentable failed credits in the range 0 to 180");
			System.out.print("Input compensentable failed credits : ");
			compen_num = sc.nextInt();
			if(compen_num <= 180 && compen_num >=0) {
				// This is valid number in 0 to 180 
				break;
			}			
		}	
	}
	
	/*
	 * Show a note.
	 * Methods to get valid number of outright failed modules
	 */
	public void getvaildfailedNum() {
		
		Scanner sc = new Scanner(System.in);	
		
		while(true) {
		
			System.out.println("To validate a number of outright failed modules in the range 0 to 11");
			System.out.print("Input outright failed modules : ");
			outright_num = sc.nextInt();
			if(outright_num <= 11 && outright_num >=0) {
				// This is valid number in 0 to 11 
				break;
			}	
		}	
	}
}
