import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert the first number");
        double a = scanner.nextDouble();
        System.out.println("insert the second number");
        double b = scanner.nextDouble();
        System.out.println("insert the third number");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta<0){
            System.out.println("The equation has no roots");
        } else if (delta==0){
            System.out.println("The equation has 1 roots = " + quadraticEquation.getRoot());
        } else {
            System.out.println("The equation has roots 1 = "+quadraticEquation.getRoot1()+"\nThe equation has root 2 = "+quadraticEquation.getRoot2());
        }

    }
}
