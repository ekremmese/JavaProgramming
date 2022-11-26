package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        //hourlyRate, weeklyhours

        int hourlyRate = 65;

        int weeklyHours = 45;
        int nOfWeeks = 52;
        int salary = hourlyRate * weeklyHours * nOfWeeks;

        System.out.println("salary = $ " + salary);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $ " + hourlyRate);
        System.out.println("nOfWeeks = " + nOfWeeks);

    }

}
