import java.util.Scanner;;
public class functionOfName {
    public static void printName(String name) {
        System.out.print("Your Name : ");
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        printName(name);
        sc.close();
    }
}
