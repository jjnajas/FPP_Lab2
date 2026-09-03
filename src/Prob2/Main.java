package Prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        String dob = input.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dob);
        HeartRate person = new HeartRate(
                firstName,
                lastName,
                dateOfBirth
        );
        System.out.println(person);
        person.printTargetHeartRateRange();
        input.close();
    }
}
