package Prob2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRate {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private static final int RHR = 70;
    private static final double LB = 0.50;
    private static final double UB = 0.85;
    public HeartRate(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today).getYears();
    }
    public int getMaximumHeartRate() {
        return 220 - getAge();
    }
    public void printTargetHeartRateRange() {
        int mhr = getMaximumHeartRate();

        int ahr = mhr - RHR;
        double lbthr = (ahr * LB) + RHR;
        double ubthr = (ahr * UB) + RHR;
        System.out.printf(
                "Target Heart Rate Range: ",
                lbthr, ubthr
        );
    }
    @Override
    public String toString() {
        return "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nDate of Birth: " + dateOfBirth +
                "\nAge: " + getAge() + " years" +
                "\nMaximum Heart Rate (MHR): " + getMaximumHeartRate();
    }

}
