package in.aj7parihar.lld218072024.lld2class2.designpatterns;

public class Client {
    public static void main(String[] args) {
        demoSingleton();
    }
    public static void demoSingleton() {
        // Negative test of Singleton Design Pattern
        // DatabaseConnection db = new DatabaseConnection();
        // Red Line error - 'DatabaseConnection()' has private access


        // No matter how many instances you create, it always points to the same address in Heap memory,
        // that means as per Singleton Design Principle only one object will be created, and rest
        // other will point to same memory in heap or will be a kind of Shallow Copy.
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        DatabaseConnection dbc2 = DatabaseConnection.getInstance();


        System.out.println("Debug");
    }
}

