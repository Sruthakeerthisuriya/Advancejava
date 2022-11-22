package Assignment;

import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		Stack<String> obj=new Stack<String>();
		obj.push("1");
		obj.push("2");
		obj.push("4");
		obj.push("3");
		obj.push("5");
		obj.push("6");
		System.out.println("Top element is "+obj.peek());
		System.out.println("Top element is "+obj.size());
		System.out.println("Top element is "+obj.pop());
		obj.pop();
		System.out.println(obj);
		if (obj.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
		obj.removeAllElements();
		if (obj.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
	}

}
