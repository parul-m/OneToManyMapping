
import dto.Account;
import dto.Employee;
import myconfig.connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class main {
    public static void main(String[] args) {
        SessionFactory sf = connection.getSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        Employee e1 = new Employee(101, "Vidhi", "CS", 2400000.0f);
        Employee e2 = new Employee(102, "Anjal", "HR", 2450000.0f);
 
        Account a1 = new Account(1, "citi bank", 20000000.0f);
        Account a2 = new Account(2, "goldman sachs", 10000000.0f);
        Account a3 = new Account(3, "morgan stanley", 20000000.0f);
        Account a4 = new Account(4, "american bank", 18000000.0f);
        
        e1.getSt().add(a1);
        e1.getSt().add(a2);
        
        e2.getSt().add(a3);
        e2.getSt().add(a4);
        
        s.save(e1);
        s.save(e2);
        s.save(a1);
        s.save(a2);
        s.save(a3);
        s.save(a4);
        
        t.commit();
        s.close();
        sf.close();
}
}
