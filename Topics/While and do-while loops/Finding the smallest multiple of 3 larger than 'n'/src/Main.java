import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input number
        int n = sc.nextInt();
        if (n > 0) {
            while (n %3 !=0) {
                n++;
            }
            // Write your code here. Use a while loop starting from n
            // and check for the smallest multiple of 3.
        } else {
            System.out.println("-1");
        }
        System.out.println(n);
        sc.close();
    }
}