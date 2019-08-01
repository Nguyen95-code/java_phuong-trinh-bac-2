import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a : ");
        double a = scanner.nextDouble();
        System.out.println("enter b");
        double b = scanner.nextDouble();
        System.out.println("enter c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Discriminant is : " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("Root 1 is : " + quadraticEquation.getRoot1());
            System.out.println("Root 2 is : " + quadraticEquation.getRoot2());
        } else {
            System.out.println("No Root");
        }
    }
}
