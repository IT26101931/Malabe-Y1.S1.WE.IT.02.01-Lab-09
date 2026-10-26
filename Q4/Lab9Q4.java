import java.util.Scanner;

public class IT26101931Lab9Q4 {

    // Calculate final mark
    public static double calcFinalMark(double assignment, double exam) {

        double finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }

    // Find grade
    public static char findGrades(double finalMark) {

        if (finalMark >= 75) {
            return 'A';
        }
        else if (finalMark >= 60) {
            return 'B';
        }
        else if (finalMark >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }

    // Print student details
    public static void printDetails(String name, double finalMark, char grade) {

        System.out.println(
                name + "\t\t" +
                finalMark + "\t\t" +
                grade
        );
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Name\t\tFinal Mark\tGrade");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = input.next();

            System.out.print("Enter Assignment Mark: ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            double exam = input.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);

            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}