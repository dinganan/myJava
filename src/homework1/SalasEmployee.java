package homework1;

public class SalasEmployee extends ColaEmployee{
	private int monthOut;
	private double rate;
	public SalasEmployee(String name, int birthMonth, int monthOut, double rate) {
		super(name, birthMonth);
		this.monthOut = monthOut;
		this.rate = rate;
	}
	@Override
	public double getSalary(int month, double salary) {
		salary = monthOut*rate;
		return super.getSalary(month, salary);
	}
	
}
