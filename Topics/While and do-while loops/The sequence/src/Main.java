import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = 0;
        int total = scanner.nextInt();
        while (scanner.hasNextInt())  {
             int cur = scanner.nextInt();
             if (cur %4==0) {
                 max = Math.max(max, cur);
             }
        }
        System.out.println(max);
    }
}