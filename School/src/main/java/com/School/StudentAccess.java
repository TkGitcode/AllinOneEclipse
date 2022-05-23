package com.School;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class StudentAccess {
	Scanner scanner = new Scanner(System.in);
	public static String nameRead;

	public void addStudentDetails() throws IOException {

		StudentDetails student = new StudentDetails();

		System.out.println("Enter Student ID No : ");
		student.setStudentId(scanner.nextInt());
		System.out.println("Enter Student Name : ");
		student.setStudentName(scanner.next());
		System.out.print("Enter Student Gender : ");
		student.setstudentGender(scanner.next());

		System.out.println("Enter a Student Address");
		System.out.println("Enter a Street Name : ");
		student.setStreet(scanner.next());
		System.out.println("Enter a District Name : ");
		student.setDistrict(scanner.next());
		System.out.println("Enter a Pincode for Your City : ");
		student.setPinCode(scanner.nextInt());

		JSONObject obj = new JSONObject();
		obj.put("StudentIdNo", student.getStudentId());
		obj.put("StudentName", student.getStudentName());
		obj.put("StudentGender", student.getstudentGender());

		JSONArray jsonArray = new JSONArray();
		jsonArray.put(student.getStreet());
		jsonArray.put(student.getDistrict());
		jsonArray.put(student.getPinCode());

		obj.put("address", jsonArray);

		JSONArray j = new JSONArray();
		j.put(obj);
		JSONObject finJson = new JSONObject();
		finJson.put("StudentDetails", j);

		File f = new File("jsonfile.json");
		if (f.exists()) {
			String path = "C:\\Users\\Sathish Kumar\\eclipse-workspace_Server\\School\\jsonfile.json";
			String content = new String((Files.readAllBytes(Paths.get(path))));

			JSONObject jsobj = new JSONObject(content);

			JSONArray arrName = jsobj.getJSONArray("StudentDetails");

			JSONObject jsonObject = new JSONObject();

			jsonObject.put("StudentDetails", arrName);

			jsonObject.getJSONArray("StudentDetails").put(obj);

			try (FileWriter fileWriter = new FileWriter("jsonfile.json")) {
				fileWriter.write(jsonObject.toString());
				fileWriter.flush();
			} catch (Exception e) {
				System.out.println(e);
			}

		} else {
			try (FileWriter fileWriter = new FileWriter("jsonfile.json")) {
				fileWriter.write(finJson.toString());
				fileWriter.flush();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

	public void viewStudentDetails() {

		String path = "C:\\Users\\Sathish Kumar\\eclipse-workspace_Server\\School\\jsonfile.json";
		try {
			String content = new String((Files.readAllBytes(Paths.get(path))));
			JSONTokener tokener = new JSONTokener(content);

			JSONObject jsonObject = new JSONObject(tokener);

			JSONArray studentDetails = jsonObject.getJSONArray("StudentDetails");
			System.out.println("----------------------------------------------");
			for (int i = 0; i < studentDetails.length(); i++) {
				System.out.println("Student Name : " + studentDetails.getJSONObject(i).getString("StudentName"));
				System.out.println("Student ID : " + studentDetails.getJSONObject(i).getInt("StudentIdNo"));
				System.out.println("Student Gender : " + studentDetails.getJSONObject(i).getString("StudentGender"));
				JSONArray address = studentDetails.getJSONObject(i).getJSONArray("address");
				System.out.println("Address : ");
				for (Object j : address) {
					System.out.println(" " + j);
				}
			}
			System.out.println("----------------------------------------------");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
