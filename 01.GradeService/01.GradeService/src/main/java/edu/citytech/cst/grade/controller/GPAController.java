package edu.citytech.cst.grade.controller;

import java.util.HashMap;
import java.util.Map;

import edu.citytech.cst.grade.service.GPACalculator;
import spark.Request;
import spark.Response;
import spark.Route;

public class GPAController {
	
	public static Route calculate = (Request req, Response res) -> {
		Map<String,Object> map = new HashMap<>();
		
		String sScore = req.queryParams("score");
		float score = Float.parseFloat(sScore);
		float qpa = GPACalculator.getGrade(score);
		String letter = GPACalculator.getLetterGrade(score);
		
		map.put("qpa",qpa);
		map.put("letter",letter);
		res.type("application/json");
		return map;
		
	};

}
