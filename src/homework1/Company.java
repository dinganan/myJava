package homework1;


import java.util.Scanner;

public  class Company {
	public static void print(ColaEmployee c){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������·�");
		int m = scan.nextInt();
		System.out.println(c.getName()+"��"+m+"�µĹ�����"+c.getSalary(m, 0));
	}
	public static void main(String[] args) {
		ColaEmployee c1 = new SalariedEmployee("����",3,3000);
		ColaEmployee c2 = new HourlyEmployee("����",4,100,120);
		ColaEmployee c3 = new HourlyEmployee("����",5,100,170);
		ColaEmployee c4 = new SalasEmployee("����",6,10,1000);
		ColaEmployee c5 = new SalasEmployee("����",9,11,900);
		ColaEmployee[] cs = {c1,c2,c3,c4,c5};
		for(ColaEmployee c : cs){
			print(c);
		}
	}
}
