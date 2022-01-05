import java.util.*;

public class Wabwera{
    public static void main(String args[]){
        
        PersonStack personStack = new PersonStack();

        
        System.out.println("\nafter adding nothing");
        System.out.println("IS EMPTY = "+personStack.isEmpty());
        System.out.println("IS FULL = "+personStack.isFull());

        personStack.push("Steve");
        System.out.println("\nafter adding 1 person");
        System.out.println("IS EMPTY = "+personStack.isEmpty());
        System.out.println("IS FULL = "+personStack.isFull());

        int count = 0;
        while(count <49){
            personStack.push("ABC");
            count++;
        }

        System.out.println("\nafter adding 49 person\n");
        System.out.println("IS EMPTY = "+personStack.isEmpty());
        System.out.println("IS FULL = "+personStack.isFull());

    }
}

class PersonStack{
    private int top = 50;
    private int index = 0;
    private int size = -1;
    private String names [] = new String[top] ;

    void push(String newNmae){
        names[index] = newNmae;
        index++;
        size++;
    }

    String pop(){
        top--;
        return names[top];
    }

    boolean isFull(){
        boolean respo;
        if(index==top){
            respo = true;
        }else{
            respo = false;
        }
        return respo;
    }

    boolean isEmpty(){
        boolean respo;
        if(size== -1){
            respo = true;
        }else{
            respo = false;
        }
        return respo;
    }
}