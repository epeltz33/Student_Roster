package apps;

import classes.Student;

public class StudentTestProgram {
    public static void main(String[] args) {
        // Create a student object about yourself
        Student myStudent = new Student("Eric", "Peltzman", "Sushi", 12, 3.50f);

        System.out.println(myStudent);
        System.out.println("First name: " + myStudent.getFirstName());
        System.out.println("Last name: " + myStudent.getLastName());
        System.out.println("Favorite snack: " + myStudent.getFavSnack());
        System.out.println("Credits: " + myStudent.getCredits());
        System.out.println("Cost beverage: " + myStudent.getCostBeverage());

        // Create a second Student object using the no-arg constructor and setters
        Student testStudent = new Student();
        testStudent.setFirstName("John");
        testStudent.setLastName("Doe");
        testStudent.setFavSnack("Chips");
        testStudent.setCredits(15);
        testStudent.setCostBeverage(2.75f);

        System.out.println("\n" + testStudent);
    }
}