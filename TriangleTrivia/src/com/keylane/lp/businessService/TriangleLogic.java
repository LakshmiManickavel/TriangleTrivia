package com.keylane.lp.businessService;

import com.keylane.lp.constants.TriangleConstants;


/**
 * This class holds the business logic to determine the type of triangle 
 * based on the given lengths.
 */
public class TriangleLogic {

	public String determineShapeType(TriangleBO bo) {

		String triangle_type;

		if (bo.getSide1() >= (bo.getSide2() + bo.getSide3())
				|| bo.getSide2() >= (bo.getSide1() + bo.getSide3())
				|| bo.getSide3() >= (bo.getSide1() + bo.getSide2())) {

			triangle_type = TriangleConstants.NOT_TRIANGLE;

		} else if (bo.getSide1() == bo.getSide2() && bo.getSide2() == bo.getSide3()) {

			triangle_type = TriangleConstants.EQUILATERAL_TRIANGLE;

		} else if ((bo.getSide1() == bo.getSide2() && bo.getSide2() != bo.getSide3())
				|| (bo.getSide2() == bo.getSide3() && bo.getSide3() != bo.getSide1())
				|| (bo.getSide3() == bo.getSide1() && bo.getSide1() != bo.getSide2())) {

			triangle_type = TriangleConstants.ISOSCELES_TRIANGLE;

		} else if (bo.getSide1() != bo.getSide2() && bo.getSide2() != bo.getSide3()
				&& bo.getSide3() != bo.getSide1()) {
			triangle_type = TriangleConstants.SCALENE_TRIANGLE;
			
		} else {
			triangle_type = TriangleConstants.ERROR_TRIANGLE;
		}

		return triangle_type;

	}

	
}
