package edu.saintjoe.cs.tcooper.realworld;

public class Student {
	String name;
	int age;
	String gender;
	int gradeYear;
/*----------------------------------------------------------------------------*/
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}
	public int getAge(){
		return age;
	}
	
	public void setGender(String newGender){
		gender = newGender;
	}
	public String getGender(){
		return gender;
	}
	
	public void setGradeYear(int newGradeYear){
		gradeYear = newGradeYear;
	}
	public int getGradeYear(){
		return gradeYear;
	}
}