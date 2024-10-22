package com.bptn.course._36_student_score_challenge;

import java.util.Map;

public class Student {

	private String name;
	private Map<String, Double> subjectScores;

	public Student(String name, Map<String, Double> subjectScores) {
		this.name = name;
		this.subjectScores = subjectScores;
	}

}