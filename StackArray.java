import java.util.*;
class Stack {
    int top =-1;
    int n = 10;
    int a[] = new int[n];
    Scanner sc = new Scanner(System.in);

    void push() {
        if (top == n-1) {
            System.out.println("Overflow ");
        } else {
            System.out.println("Enter data : ");
            int i = sc.nextInt();
            top++; 
            a[top] = i;
            System.out.println("Item is inserted.");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Underflow ");
        } else {
            top--;
            System.out.println("Item is deleted.");
        }
    }
    void display() {
        System.out.print("Items are : ");
        for (int j=top;j>=0;j--) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
    }
}
public class StackArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack st = new Stack();
            while (true) {
                System.out.println("Press 1 for push");
                System.out.println("Press 2 for pop");
                System.out.println("Press 3 for DISPLAY");
                System.out.println("Press 0 for EXIT");
                System.out.print("Enter choice : ");
                int x = sc.nextInt(); 
                switch (x) {
                case 0: System.out.println("EXIT"); 
                break;
                case 1: st.push();
                break;
                case 2: st.pop();
                break;
                case 3: st.display();
                break;
                default: System.out.println("INVALID CHOICE");
                }
            }
        }
    }
}
