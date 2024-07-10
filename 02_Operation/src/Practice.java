
public class Practice {

	public static void main(String[] args) {
		int num1 = 7;	
		int num2 = 3;
		System.out.println("num1 / num2 =" + (num1 / num2));
		System.out.println("num1 / num2 = " + (7.0 / 3.0));
		
		System.out.println("num1 % num2 = " + (num1 % num2));
		System.out.println("num1 % num2 = " + (7.0 % 3.0));
	int num = 40;
	num += 6;
		System.out.println(num);
	int num3 = 10;
		System.out.println(num3 >= 10);
	int age = 20;
		System.out.println(age < 20);
	int num4 = 20;
	int num5 = 30;
	System.out.println((num4 < 20) && (num5 < 40));
	// (num4 < 20) 가 false 이므로 (num5 < 40)는 생략
	System.out.println((num4 < 30) || (num5 < 40));
	// (num4 < 30) 가 true 이므로 (num5 < 40)는 생략
	
	int a = 10;
	int b = 20;
	
	//System.out.println(a);
	//System.out.println(b);
	
	int c = (a++) + (++b);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	byte n1 = 13;
	byte n2  = 7;
	byte n3 = (byte)(n1 & n2);
	System.out.println(n3);
	

	
	}

}
