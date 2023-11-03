package com.keylane.lp.main;

import java.util.Scanner;

import com.keylane.lp.requestHandler.UserInput;
import com.keylane.lp.constants.TriangleConstants;



/**
 * This class holds the main method and indicates the start of the program
 *
 */
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(TriangleConstants.WELCOME_MESSAGE);

		String decision;

		try {
			do {

				System.out.println(TriangleConstants.CONTINUE_MESSAGE);
				
				// Getting choice from the user
				Scanner sc = new Scanner(System.in);
				decision = sc.next();

				// Validating the choice entered
				if (!decision.equalsIgnoreCase("Y") && !decision.equalsIgnoreCase("N")) {
					System.out.println(TriangleConstants.INVALID_MESSAGE);
					decision = "retry";
					
				} else if (decision.equalsIgnoreCase("N")) {
					break;
					
				} else if (decision.equalsIgnoreCase("Y")) {
					
					UserInput obj = new UserInput();
					
					// Calling input() of UserInput.java class
					obj.input();  
				}
				
			} while (decision.equalsIgnoreCase("Y") || decision.equalsIgnoreCase("retry"));
			
		} catch (Exception e) {
			System.out.println(TriangleConstants.INVALID_MESSAGE);
		}
	}

}
