import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier=new Scanner(System.in);
		double w, h, bmi;
		System.out.println("Wieght?");
		w = clavier.nextDouble();
		System.out.println("Hieght?");
		h = clavier.nextDouble();
		bmi = w/(h*h);
		System.out.println("Your BMI is "+bmi);
		
	}

}
