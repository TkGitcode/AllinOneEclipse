package com.schoolmanagement;

import com.google.gson.Gson;

public class StudentAccess {

	public static void main(String[] args) {
		System.out.println("HIi");
		StudentDetails std = new StudentDetails();
//		HashMap<String, StudentDetails> stHashMap = new HashMap<String, StudentDetails>();
//		stHashMap.put("Student", new StudentDetails("Kumar", 1254, "A"));

		std.setStudentId(74);
		std.setStudentName("Kumar");
		std.setStudentSection("A");

		Gson gson = new Gson();
		String val = gson.toJson(std);
		System.out.println(val);
	}
}
