package homework1;

public class SalariedEmployee extends ColaEmployee{
	private int monthSalary;

	
	public SalariedEmployee(String name, int birthMonth, int monthSalary) {
		super(name, birthMonth);
		this.monthSalary = monthSalary;
	}


	@Override
	public double getSalary(int month, double salary) {
		salary = monthSalary;
		return super.getSalary(month, salary);
	}
	

}
