package in.aj7parihar.lld218072024.lld2class2.designpatterns;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {

    // LAZY INSTANTIATION -- NOT THREAD SAFE BECAUSE MULTIPLE THREADS CAN ACCESS CRITICAL SECTION SIMULTANEOUSLY
    // AND CREATE MULTIPLE INSTANCE, VIOLATING SINGLETON PRINCIPLE.
    private static DatabaseConnection dbc;
    private String url;
    private String username;
    private String password;
    private static Lock lock = new ReentrantLock();

    private PrintWriter pw = null;
    private FileWriter fw = null;

    private DatabaseConnection() {}
    public static DatabaseConnection getInstance() {
        if(dbc == null) {
            lock.lock();
            if (dbc == null) {
                dbc = new DatabaseConnection();
            }
            lock.unlock();
        }
        return dbc;
    }

    // EAGER INSTANTIATION -- THREAD SAFE BECAUSE EVEN IF MULTIPLE THREADS ACCESS CRITICAL SECTION SIMULTANEOUSLY
    // INSTANCE IS CREATED AT CLASS LOADING/COMPILE TIME ITSELF.
//    private static DatabaseConnection dbc = new DatabaseConnection();
//    private String url;
//    private String username;
//    private String password;
//
//    private DatabaseConnection() {}
//    public static DatabaseConnection getInstance() {
//        return dbc;
//    }
}
