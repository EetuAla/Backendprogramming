package com.example.FriendList.domain;

public class Friends {
	private String Name;
	

	public Friends() {
	}

	public Friends(String Name) {
		this.Name = Name;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
}