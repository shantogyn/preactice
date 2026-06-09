import java.util.Scanner;

public class Main {
    static class Reverse {
        int num;

        Reverse() {
            num = 0;
        }

        Reverse(int num) {
            this.num = num;
        }

        void getInput() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }

        void doReverse() {
            int temp = num;
            int rev = 0;

            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            System.out.println("Reversed Number: " + rev);
        }
    }

    public static void main(String[] args) {
        Reverse r1 = new Reverse();
        r1.getInput();
        r1.doReverse();

        Reverse r2 = new Reverse(12345);
        r2.doReverse();
    }
}