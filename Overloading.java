public class Overloading{
public static void main(String args[]){
	System.out.println("This program show method Overloading");
		System.out.println("The maximum number between 8 and 5 is "+maxNumber(8,5));
		
	}
	public static int maxNumber(int Number1, int Number2){
		int maxnum;
		if(Number1>Number2){
			maxnum = Number1;
		}else
			maxnum = Number2;

			return maxnum;
	}
}