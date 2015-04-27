import java.util.ArrayList;
import java.util.Scanner;

//**Main method/
public class Test{
	public static void main(String[] args){
		//Create an object
		MyStack stacka = new MyStack();
		
		//My Stack
		stacka.push("This");
		stacka.push("is");
		stacka.push("my");
		stacka.push("homework!");
		
		MyStack Clonestacka = (MyStack)stacka.clone();
		
		//CloneStack
		Clonestacka.push("This");
		Clonestacka.push("is");
		Clonestacka.push("my");
		Clonestacka.push("homework!");
		
	System.out.println("Stack is" + stacka.getSize());
	System.out.println("CloneStack is" + Clonestacka.getSize());	
	}
}	
