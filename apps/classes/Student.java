package classes;

public class Student {
    private String firstName;
    private String lastName;
    private String favSnack;
    private int credits;
    private float costBeverage;

    public Student() {
        // Default constructor
    }

    public Student(String firstName, String lastName, String favSnack, int credits, float costBeverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favSnack = favSnack;
        this.credits = credits;
        this.costBeverage = costBeverage;
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

    public String getFavSnack() {
        return favSnack;
    }

    public void setFavSnack(String favSnack) {
        this.favSnack = favSnack;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public float getCostBeverage() {
        return costBeverage;
    }

    public void setCostBeverage(float costBeverage) {
        this.costBeverage = costBeverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", favSnack='" + favSnack + '\'' +
                ", credits=" + credits +
                ", costBeverage=" + costBeverage +
                '}';
    }
}