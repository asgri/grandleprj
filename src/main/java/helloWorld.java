import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

/**
 * Created by alex on 07.06.17.
 * https://youtu.be/Tab1LOG25ww
 */
public class helloWorld {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.close();
        sessionFactory.close();
    }
}
