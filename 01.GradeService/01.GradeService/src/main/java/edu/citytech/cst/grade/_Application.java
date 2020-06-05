package edu.citytech.cst.grade;

import static spark.Spark.*;

import com.google.gson.Gson;

import edu.citytech.cst.grade.controller.DeveloperController;
import edu.citytech.cst.grade.controller.GPAController;

public class _Application {

	public static void main(String[] args) {
		
		if (args.length == 0)
			port(4567);
		else {
			int portNumber = Integer.parseInt(args[0]);
			port(portNumber);
		}
		
		
		
		Gson gson = new Gson();
		
		get("/author", DeveloperController.getAuthor , gson::toJson);
		get("/grade", GPAController.calculate , gson::toJson);

	}

}
