public class Student {
    String name;
    double[] marks;
    
    // Constructor to initialize the student object
    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }
    
    // Method to compute the total and average marks
    public void computeTotalAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / marks.length;
        
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
    
    // Method to display student data
    public void displayData() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
    
    public static void main(String[] args) {
        double[] studentMarks = { 90, 85, 78, 92, 88 };
        Student student = new Student("John", studentMarks);
        
        student.displayData();
        student.computeTotalAverage();
    }
}