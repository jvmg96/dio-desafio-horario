import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sec = input.nextDouble();
        double hour = Math.floor(sec / 3600);
        sec = sec - (hour * 3600);
        double min = Math.floor(sec / 60);
        sec = sec - (min * 60);

        System.out.println((int)hour+":"+(int)min+":"+(int)sec);
    }
}