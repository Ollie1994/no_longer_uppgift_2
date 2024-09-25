package BudgetManagerApp;

public class BudgetTracker_Main {
    public static void main(String[] args) {
        // testar lite under bara
        User user1 = new User("Oliwer", "Karlsson");
        System.out.println(user1); // här måste vi omvandla från klass USER till klass string för att skriva ut
        System.out.println(user1.getFirstName() + " " + user1.getLastName()); // här behöver vi itne det pga getter
        user1.displayUser(); // samam här, pga av metod sp blir det utskivit

    }
}
