import java.util.Scanner;
public class Overloading{
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("This program show method Overloading");
	System.out.println("please enter 2 numbers");
	double Number1 = input.nextDouble();
	double Number2 = input.nextDouble();

		System.out.println("The maximum number between"+Number1+" and "+Number2+" is "+max(Number1,Number2));
		
	}
	public static int max(int Number1, int Number2){
		int maxnum;
		if(Number1>Number2){
			maxnum = Number1;
		}else
			maxnum = Number2;

			return maxnum;
	}public static double max(double Number1, double Number2){
		double maxinum ;
		if(Number1>Number2){
			maxinum = Number1;
		}else
			maxinum = Number2;
			return maxinum;
	}
}