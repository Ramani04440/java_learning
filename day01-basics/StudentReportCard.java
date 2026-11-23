import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PASS_MARK = 40.0;

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone number: ");
        long phone = sc.nextLong();

        System.out.print("Enter section: ");
        char section = sc.next().charAt(0);

        System.out.print("Enter marks in 3 subjects: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        System.out.print("Attended all classes (true/false): ");
        boolean attended = sc.nextBoolean();

        double total = m1 + m2 + m3;
        double average = total / 3;
        int totalInt = (int) total;
        int lastDigit = roll % 10;
        String type = (roll % 2 == 0) ? "Even" : "Odd";

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        boolean passed = m1 >= PASS_MARK && m2 >= PASS_MARK && m3 >= PASS_MARK;
        boolean failedAny = m1 < PASS_MARK || m2 < PASS_MARK || m3 < PASS_MARK;

        System.out.println();
        System.out.println("========== REPORT CARD ==========");
        System.out.printf("Name       : %s%n", name);
        System.out.printf("Roll No    : %d (%s)%n", roll, type);
        System.out.printf("Last digit : %d%n", lastDigit);
        System.out.printf("Phone      : %d%n", phone);
        System.out.printf("Section    : %c%n", section);
        System.out.printf("Total      : %.2f (%d as int)%n", total, totalInt);
        System.out.printf("Average    : %.2f%n", average);
        System.out.printf("Grade      : %c%n", grade);
        System.out.printf("Result     : %s%n", passed ? "Pass" : "Fail");
        System.out.printf("Attendance : %b%n", attended);

        if (passed && attended) {
            System.out.println("Attendance bonus eligible");
        }
        if (failedAny) {
            System.out.println("Failed in at least one subject");
        }
        if (!passed) {
            System.out.println("Needs improvement");
        }
        System.out.println("=================================");

      
    }
}
