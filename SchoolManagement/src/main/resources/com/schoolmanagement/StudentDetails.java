package com.schoolmanagement;

import java.io.FileReader;

import org.json;
import org.json.simple.JsonObject;
import org.json.simple.parser;

public class StudentDetails {

	public static void main(String[] args) {
          JSONParser json=new JSONParser();
          FileReader reader =new FileReader(".\\jsonFile\\School.json");
          
          Object obj=json.parse(reader);
          
          JsonObject stJsonObj=(JsonObject)obj;
          
          String name=(String) stJsonObj.get("firstName");
          
          System.out.println(name);
          
	}

}
