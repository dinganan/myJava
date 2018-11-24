package homework1;


import java.util.Scanner;

public  class Company {
	public static void print(ColaEmployee c){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入月份");
		int m = scan.nextInt();
		System.out.println(c.getName()+"在"+m+"月的工资是"+c.getSalary(m, 0));
	}
	public static void main(String[] args) {
		ColaEmployee c1 = new SalariedEmployee("张三",3,3000);
		ColaEmployee c2 = new HourlyEmployee("张四",4,100,120);
		ColaEmployee c3 = new HourlyEmployee("张五",5,100,170);
		ColaEmployee c4 = new SalasEmployee("张六",6,10,1000);
		ColaEmployee c5 = new SalasEmployee("张七",9,11,900);
		ColaEmployee[] cs = {c1,c2,c3,c4,c5};
		for(ColaEmployee c : cs){
			print(c);
		}
	}
}
