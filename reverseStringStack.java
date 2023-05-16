import java.util.*;
import java.util.Stack;
class reverseStringStack {
    public static String RS(String str) {
        Stack<Character> stack = new Stack<Character>();
        char[] revstr = new char[str.length()];
        
        
        for(int i = 0;i<str.length();i++) {
            stack.push(str.charAt(i));
        }
        int i = 0;
        while(!stack.isEmpty()) {
            revstr[i++] = stack.pop();
        }
        return new String(revstr);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(RS(s));
        sc.close();
    }
}