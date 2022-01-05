//BSC-COM-35-19
// imports java from java libraries
import java.util.Scanner;
// creates the class
public class Triangle{
    //creates the main method
    public static void main(String[]args){
        // creates a scanner object and assign object to variable
        Scanner input = new Scanner (System.in);
        //creates an array to hold the angles
        double[]ray = new double[3];
        //prompt the user to enter three angles
        System.out.println("Enter the three angles");
        
        //starts a for loop
        for( int i = 0; i < ray.length;i++){
          ray[i] =input.nextDouble();
          
}
           double sumTotal = ray[0]+ray[1]+ray[2];
           if(sumTotal == 180){
               System.out.println("it is valid triangle");
               if(ray[0]<90 && ray[1]<90 && ray[2]<90){
                   System.out.println("it is an acute triangle");
               }else if(ray[0] == 90 || ray[1]==90 || ray[2]==90){
                   System.out.println("it is a right angled triangled");
               }else{

                   System.out.println("it is an obtuse triangle ");
               }
           } else{
               System.out.println("Triangle not possible ");
           }
        
    }//marks the end of the method
}//marks the end of the class