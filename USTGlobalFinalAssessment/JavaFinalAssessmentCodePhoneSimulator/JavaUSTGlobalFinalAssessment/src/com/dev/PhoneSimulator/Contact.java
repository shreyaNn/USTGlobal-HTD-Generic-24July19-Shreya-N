package com.dev.PhoneSimulator;


public class Contact {
	
private String name;
private int userid;

private long number;
private String group;
private Inbox i;

static int idGen = 0;

@Override
public String toString() {
	return "Contact [name=" + name + ", number=" + number + ", group=" + group + "]";
}

public int getUserid() {
	return userid;
}
static public Contact createObject() {
	Contact a = new Contact();
	return a;
}


public void setUserid() {
	this.userid = this.idGen;
	this.idGen++;
}


public Inbox getI() {
	return i;
}


public void setI(Inbox i) {
	this.i = i;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((group == null) ? 0 : group.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + (int) (number ^ (number >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Contact other = (Contact) obj;
	if (group == null) {
		if (other.group != null)
			return false;
	} else if (!group.equals(other.group))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (number != other.number)
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
}
