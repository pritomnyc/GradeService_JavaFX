package edu.citytech.cst.grade.controller;

import java.util.HashMap;
import java.util.Map;

import spark.Request;
import spark.Response;
import spark.Route;

public class DeveloperController {
	
	public static Route getAuthor = (Request req, Response res) -> {
		Map<String,Object> map = new HashMap<>();
		map.put("name","pritom,mahim");
		map.put("email","xtrmprtm@gmail.com");
		map.put("phone","631.415.6470");
		map.put("experience",20);
		
		res.type("application/json");
		return map;
	};

}
