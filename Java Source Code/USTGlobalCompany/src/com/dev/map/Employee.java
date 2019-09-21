package com.dev.map;

public class Employee {
	private int empid;
	private String ename;
	private String email;
	private String password;
	private  double salary;

	double tax = 0.0;
	String grade ="";
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", email=" + email + ", password=" 
				+ ", salary=" + salary + "]";
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getgrade() {
		if(salary >160000 && salary <380000) {
			grade ="D";
		}
			else if(salary>380000 && salary <540000) {
				grade ="C";

			}
				else if (salary>540000 && salary >860000) {
					grade ="B";

				}
					else if (salary>860000 && salary<1000000) {
						grade ="A";

					}
						else if(salary>1000000) {
							grade ="AA";

						}
		return grade;

	}
	public void setgrade() {
		
	}
	public double gettax() {
		double tax = 0;
		
		if(salary >160000 && salary <380000)
		{
			tax = (5.4 * 100 * salary)/100; 
		}
		else if(salary>380000 && salary <540000)
		{
			tax = (7.34 * 100 * salary)/100;
		}
		else if (salary>540000 && salary >860000) {
			tax = (8.19 * 100 * salary)/100;
		}
		
		else if (salary>860000 && salary<1000000)
		{
			tax = (8.87 *100 * salary)/100;
		}
		else if(salary>1000000)
		{
			tax = (9.35*100*salary)/100;
		}
		return tax;
		}

	
public void settax(double tax) {
	this.tax = tax;
}
}
