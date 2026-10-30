import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

class Sos {

	private int a;
	private int b;
	private int x;
	public Sos() {
	}
	public Sos(int x) {

		this.x = x;
	}
	public Sos(int a, int b) {
		this.a = a;
		this.b = b;

	}
	public Sos(int a, int b, int x) {
		this.a = a;
		this.b = b;
		this.x = x;
	}

	public int metod1() {
		return 3*x+5;
	}
	public int metod2() {
		if (a==b) return 0;
		return (a+b)/(a-b);
	}
	
	public BigInteger metod3() {
		if (b==0) 
			return BigInteger.ZERO;
		
		return factorial(a*x/b);
		
		
	}
	
	private BigInteger factorial(int x) {
		if(x < 0) return BigInteger.ZERO;
		
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= x; i++) {
			result = result.multiply(BigInteger.valueOf(i));
			
		}
		return result; 
	}
}


public class Z1 {

	public static void main(String[] args) {
		PrintStream o = System.out;
		Scanner sc = new Scanner(System.in);
		
		o.println("Введите x");
		int x = sc.nextInt();
		
		o.println("Введите a");
		int a = sc.nextInt();
		
		o.println("Введите b");
		int b = sc.nextInt();
		
		sc.close();
		
		Sos o1 = new Sos(x);
		int y1 = o1.metod1();
		o.println("метод 1");
		o.println(y1);

		Sos o2 = new Sos(a,b);
		int y2 = o2.metod2();
		o.println("метод 2");
		o.println(y2);
		
		Sos o3 = new Sos(a, b, x);
		BigInteger y3 = o3.metod3();
		o.println("метод 3");
		o.println(y3);
	}
}
