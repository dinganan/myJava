package homework1;

import java.util.Scanner;

public class ColaEmployee {
	private String name;
	private int birthMonth;
	Scanner scan = new Scanner(System.in);
	
	public ColaEmployee(String name, int birthMonth) {
		super();
		this.name = name;
		this.birthMonth = birthMonth;
	}
	public ColaEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public double getSalary(int month,double salary) {
		if(birthMonth == month){
			return salary+100;
		}
		return salary;
	}

	
}
