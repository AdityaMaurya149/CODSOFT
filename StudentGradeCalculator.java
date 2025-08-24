import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner my_input = new Scanner(System.in);

        System.out.print("enter the amount of subjects you took: ");
        int the_number_of_subjects = my_input.nextInt();
        
        int total_marks = 0;
        
        for (int i = 1; i <= the_number_of_subjects; i++) {
            System.out.print("enter your marks for subject " + i + ": ");
            int my_marks = my_input.nextInt();
            total_marks = total_marks + my_marks;
        }
        
        double what_is_my_average = (double) total_marks / the_number_of_subjects;
        
        char my_grade;
        if (what_is_my_average >= 90) {
            my_grade = 'A';
        } else if (what_is_my_average >= 80) {
            my_grade = 'B';
        } else if (what_is_my_average >= 70) {
            my_grade = 'C';
        } else if (what_is_my_average >= 60) {
            my_grade = 'D';
        } else {
            my_grade = 'F';
        }

        System.out.println("all done here is the info");
        System.out.println("your total marks are: " + total_marks);
        System.out.printf("your average is: %.2f%%\n", what_is_my_average);
        System.out.println("so your grade is: " + my_grade);

        my_input.close();
    }
}