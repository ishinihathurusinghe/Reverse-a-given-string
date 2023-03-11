           import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        Stack<Character> stack = new Stack<Character>();


        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }


        String reversed = "";
        while (!stack.empty()) {
            reversed += stack.pop();
        }


        System.out.println("Reversed string: " + reversed);
    }
}
