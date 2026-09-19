import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //compound interest calculator go
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int times_compounded;
        int years;
        double amount;

        System.out.print("Enter The principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter The interesr rate(int%): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # times compounded pre year: ");
        times_compounded = scanner.nextInt();
        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / times_compounded, times_compounded * years);
        System.out.printf("The amount after %d years is $%.2f ",years,amount);
        scanner.close();


        //compound interest calculator gg

    }
}
