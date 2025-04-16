import java.util.Scanner;

public class ExamScoreTracker {
    public static class Student {
        int marks;
    }
    public static void main(String[] args) {
        final int NUM_STUDENTS = 5;
        Student obj[] = new Student[NUM_STUDENTS];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the exam scores for each student:");
        for (int i = 0; i < NUM_STUDENTS; i++){
            obj[i] = new Student();
            System.out.println("Enter score for student " + (i + 1));
            obj[i].marks = scanner.nextInt();
        }

        int sum = 0;
        int highestScore = obj[0].marks;
        for (int i = 0; i < NUM_STUDENTS; i++) {
            sum += obj[i].marks;
            if (obj[i].marks > highestScore) {
                highestScore = obj[i].marks;
            }
        }
        System.out.println("Exam score statistics");
        System.out.println("Sum of all scores " + sum);
        System.out.println("Highest Score " + highestScore);
    }
}
