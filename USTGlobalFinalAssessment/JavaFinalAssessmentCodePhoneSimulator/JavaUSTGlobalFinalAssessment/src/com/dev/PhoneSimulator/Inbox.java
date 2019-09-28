package com.dev.PhoneSimulator;

import java.util.Arrays;


public class Inbox {
	static int inIdGen = 0;
	private int messageID;
	private int userId;
	private String message[] = new String[10];
	
	public static int getInIdGen() {
		return inIdGen;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(message);
		result = prime * result + messageID;
		result = prime * result + userId;
		return result;
	}
	static public Inbox createObj() {
		Inbox i = new Inbox();
		return i;
	}
	@Override
	public String toString() {
		return "Inbox [messageID=" + messageID + ", userId=" + userId + ", message=" + Arrays.toString(message) + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inbox other = (Inbox) obj;
		if (!Arrays.equals(message, other.message))
			return false;
		if (messageID != other.messageID)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	public static void setInIdGen(int inIdGen) {
		Inbox.inIdGen = inIdGen;
	}
	public int getMessageID() {
		return messageID;
	}
	public void setMessageID(int messageID) {
		this.messageID = this.inIdGen;
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	public void setMessage(String[] message) {
		this.message = message;
	}
	public String[] getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message[this.inIdGen] = message;
		this.inIdGen++;
	}
}
