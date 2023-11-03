package com.keylane.lp.requestHandler;

import java.util.Scanner;

import com.keylane.lp.utils.ShapeUtils;
import com.keylane.lp.businessService.TriangleLogic;
import com.keylane.lp.businessService.TriangleBO;
import com.keylane.lp.constants.TriangleConstants;

/**
 * This class is used to get the lengths of the triangle from the user.
 *
 */
public class UserInput {

	TriangleBO bo;
	TriangleLogic logic;

	public void input() {

		System.out.println(TriangleConstants.INPUT_MESSAGE);

		try {

			Scanner sc = new Scanner(System.in);
			bo = new TriangleBO();

			// Setting the user input to business object class
			bo.setSide1(sc.nextInt());
			bo.setSide2(sc.nextInt());
			bo.setSide3(sc.nextInt());

			ShapeUtils utils = new ShapeUtils();

			// Rectangle type is determined, only if the user input value is greater than zero
			if (utils.isValidInput(bo)) {

				logic = new TriangleLogic();
				String triangleType = logic.determineShapeType(bo);
				System.out.println(triangleType);
			}
			
		} catch (Exception e) {
			System.out.println(TriangleConstants.INVALID_INPUT);
		}
	}

}
