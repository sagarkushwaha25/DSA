import java.util.Scanner;
public class arrayposneg {
    arrayposneg() {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[10];
        System.out.println("Enter elements in array : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int p = 0;
        int n = 0;
        int i = 0;
        while (i < ar.length) {
            if (ar[i]>0)
                p++;
            else 
                n++; 
            i++;
        }
        System.out.println("Positive elements : "+p);
        System.out.println("Negative elements : "+n);
        sc.close();
    }
    public static void main(String[] args) {
        
    }
}
