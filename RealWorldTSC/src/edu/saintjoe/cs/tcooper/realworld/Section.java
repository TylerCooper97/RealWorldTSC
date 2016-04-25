package edu.saintjoe.cs.tcooper.realworld;

public class Section {
	String room;
	String time;
	String title;
	Student[] roster;
/*----------------------------------------------------------------------------*/
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
	
}