package com.keylane.lp.utils;

import com.keylane.lp.constants.TriangleConstants;
import com.keylane.lp.businessService.TriangleBO;

public class ShapeUtils {

	public boolean isValidInput(TriangleBO bo) {
		
		boolean isValid = true;
		
		 // Condition to check f the user input is non-negative and greater than zero
		 if(bo.getSide1() <= 0 || bo.getSide2() <= 0 || bo.getSide3() <= 0) {
		        System.out.println(TriangleConstants.INVALID_INPUT);
		        isValid = false;
		 }
		 return isValid;
	}
}
