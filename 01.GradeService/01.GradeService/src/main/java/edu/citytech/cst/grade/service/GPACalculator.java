package edu.citytech.cst.grade.service;

public class GPACalculator {
	
	public static float getGrade(float score) {
		if (score >= 93)
			return 4.0f;
		else if (score >= 90)
			return 3.7f;
		else if (score >= 87)
			return 3.3f;
		else if (score >= 83)
			return 3.0f;
		else if (score >= 80)
			return 2.7f;
		else if (score >= 77)
			return 2.3f;
		else if (score >= 75)
			return 2.0f;
		else if (score >= 60)
			return 1.0f;
		else
			return 0.0f;
	}
	
	public static String getLetterGrade(float score) {
		if (score >= 93)
			return "A";
		else if (score >= 90)
			return "A-";
		else if (score >= 87)
			return "B+";
		else if (score >= 83)
			return "B";
		else if (score >= 80)
			return "B-";
		else if (score >= 77)
			return "C+";
		else if (score >= 75)
			return "C";
		else if (score >= 60)
			return "D";
		else
			return "F";
	}
	

}
