package com.stl.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static Map getOriginalMarks()
	{
		Map grades = new HashMap();
		grades.put("Abc", 82);
		grades.put("DEF", 80);
		return grades; 
	}
	public static Map getMakeUpMarks()
	{
		Map grades = new HashMap();
		grades.put("Abc", 85);
		grades.put("DEF", 78);
		return grades; 
	}
	public static void main(String[] args) {
		Map<String,Integer> gradeBook = getOriginalMarks();
		Map<String,Integer> makeUpGrades = getMakeUpMarks();
		
		gradeBook.forEach((student, originalGrade) -> {
			Integer makeupGrade = makeUpGrades.get(student);
			if(makeupGrade > originalGrade)
			{
				gradeBook.put(student, makeupGrade);
			}
			System.out.println(student + " " + gradeBook.get(student));
		});
		
	}
}
