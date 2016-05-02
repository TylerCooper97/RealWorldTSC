package edu.saintjoe.cs.tcooper.realworld;

public class Section {
	public String room;
	public String time;
	public String title;
	public String teacher;
	public Student[] roster;
/*----------------------------------------------------------------------------*/
	public Section (String newRoom, String newTime, String newTitle, String newTeacher){
		
	}

	public void setRoom(String newRoom){
		room = newRoom;
	}
	public String getRoom(){
		return room;
	}
	
	public void setTime(String newTime){
		time = newTime;
	}
	public String getTime(){
		return time;
	}
	
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public String newTitle(){
		return title;
	}
	
	public void setTeacher(String newTeacher){
		title = newTeacher;
	}
	public String newTeacher(){
		return teacher;
	}
	
}