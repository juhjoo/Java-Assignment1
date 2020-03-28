	/**
	   Practical Programming Assignment 1
	   Class:   Algorithms and Data Structures
	   Author:  HyunJu Ju
	   Date:    Mar 3152020
	 */
	
	import java.util.*;
	
	public class ModuleGrader {
		
		// the mark(e.g. 65)
		private int mark;
		// the grade(e.g. "Good")
		private String grade;
		// the grading criteria
		private String criteria;
		
	    /**
	     * Show a note.
	     * @param mark_num
	     * @return The grading criteria concerning the mark
	     */
		public String gradeModule(int mark_num) {
				
			if(mark_num >= 70 && mark_num <= 100) {
				grade = "Excellent";
			} else if(mark_num >= 60 && mark_num <= 69) {
				grade = "Good";
			} else if(mark_num >= 50 && mark_num <=59) {
				grade = "Satisfactory";
			} else if(mark_num >= 40 && mark_num <=49) {
				grade = "Compensatable fail";
			} else {
				grade = "Outright fail";
			}
			
			return grade;
		
		}
		
		/**
		 * Show a note.
		 * Methods to get the grading criteria and show the result.
		 */
		public void getValidModuleMark() {
			
			Scanner sc = new Scanner(System.in);			
			
			while(true) {
				System.out.println("To validate a mark in the range 0 to 100");
				System.out.print("Input Mark : ");
				mark = sc.nextInt();
				if(mark <= 100 && mark >=0) {
					criteria = gradeModule(mark);
					 // To call gradeModule with a mark
					break;
				}		
			}
		
			System.out.println("Your grade is " + criteria);
			System.out.println("");	
					
		}
		
		/**
		 * Show a note.
		 * Methods to start module grade
		 */
		public void startModuleGrading() {
			// initiate a message
			String message = "y";
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				
				if(message.equals("n")) {
					System.out.println("*********** Finishing Module Grading Program *********");
					// This is "n", so ending grading program
					break;
				} else if(message.equals("y")) {
					System.out.println("*********** Module Grading Program *********");
					
					// To call getValidModuleMark in order to get the grading criteria
					getValidModuleMark();
					
					System.out.print("continue grading : yes/no(y/n) : ");
					message = sc.nextLine();
					// This is "y", so ongoing grading program
				} else {
					System.out.println("To validate a input is 'y' or 'n'");
					System.out.print("continue grading : yes/no(y/n) : ");
					message = sc.nextLine();
				}
				
				System.out.println("");	
			}
	
		}
	
	}
