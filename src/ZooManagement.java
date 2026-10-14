
import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the zoo name: ");
        String zooName = scanner.nextLine().trim();

        while (zooName.isEmpty()) {
            System.out.print("The zoo name cannot be empty. Try again: ");
            zooName = scanner.nextLine().trim();
        }

        int nbrCages;

        while (true) {
            System.out.print("Enter the number of cages: ");

            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();

                if (nbrCages > 0) {
                    break;
                }

                System.out.println("The number must be positive.");
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        System.out.println(zooName + " has " + nbrCages + " cages");

        scanner.close();
    }
}
