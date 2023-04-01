import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int perpendicularLength1;
        int perpendicularLength2;
        int lengths;
        double hypotenuse;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first perpendicular length: ");
        perpendicularLength1 = scanner.nextInt();

        System.out.print("Please enter second perpendicular length: ");
        perpendicularLength2 = scanner.nextInt();

        lengths = (perpendicularLength1 * perpendicularLength1) + (perpendicularLength2 * perpendicularLength2);

        hypotenuse = Math.sqrt(lengths);
        System.out.println(hypotenuse);
    }
}
