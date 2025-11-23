import java.util.*;

interface CalculateResult{
	int CalculateTotal();
	double CalculatePercentage();
	String CalculateGrade();

}

class Student implements CalculateResult{
	String name;
	int[] marks; 

 public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;

public int CalculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    
    public double CalculatePercentage() {
        int total = CalculateTotal();
        return (double) total / (marks.length * 100) * 100;
    }

    
    public String CalculateGrade() {
        double percentage = CalculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 75) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

     public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + CalculateTotal());
        System.out.println("Percentage: " + CalculatePercentage() + "%");
        System.out.println("Grade: " + CalculateGrade());
    }
}
public class Main {
    public static void main(String[] args) {
               int[] marks = {85, 90, 78, 88, 92};
        Student s1 = new Student("Alice", marks);

        
        s1.displayResult();
    }
}
}