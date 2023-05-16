import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("I want table of : ");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            int r = n * i;
            System.out.println(n+"*"+i+"="+r);
        }
        sc.close();
    }
    
}
