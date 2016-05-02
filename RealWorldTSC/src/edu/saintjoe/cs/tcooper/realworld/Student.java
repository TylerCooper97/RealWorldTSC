package edu.saintjoe.cs.tcooper.realworld;

public class Student {
	private String name;
	private int age;
	private String gender;
	private int gradeYear;
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
	
	public String toString(){
		return ("Student: " + name + " Gender: " + gender + " Class Year: " + gradeYear + " Age: " + age);
	}
}