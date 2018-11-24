package homework1;

public class HourlyEmployee extends ColaEmployee{
	private int timeSalary;
	private int time;
	public HourlyEmployee(String name, int birthMonth, int timeSalary, int time) {
		super(name, birthMonth);
		this.timeSalary = timeSalary;
		this.time = time;
	}
	@Override
	public double getSalary(int month, double salary) {
		if(time <= 160){
			salary = time*timeSalary;
		}else{
			salary = 160*timeSalary + (time-160)*1.5*timeSalary;
		}
		return super.getSalary(month, salary);
	}
	
}
