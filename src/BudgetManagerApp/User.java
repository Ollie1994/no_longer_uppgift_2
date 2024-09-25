package BudgetManagerApp;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // ----------------------- METHODS -----------------------------------------------------
    public void displayUserDetails () {
        System.out.println("User: " + getFirstName() + " " + getLastName());
    }

    // ----------------------- G & S --------------------------------------------------------
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
}

