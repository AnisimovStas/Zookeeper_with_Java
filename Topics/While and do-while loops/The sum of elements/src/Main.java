import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        var sum=0;
        var stop = false;
        while (!stop) {
            var currentNumber = scanner.nextInt();
            if (currentNumber ==0){
            stop = true;
            } else {
                sum+= currentNumber;
            }
        }
        System.out.println(sum);
    }
}