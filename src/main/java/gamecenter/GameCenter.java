package gamecenter;


import gamecenter.db.entity.ArmorEntity;
import gamecenter.db.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by MooN on 2016-11-24.
 */
public class GameCenter {

    public static void main(String[] args) {


        ArmorEntity a = new ArmorEntity();
        a.setDescibe("ArmorEntity");

        UserEntity u = new UserEntity();
        u.setId(1000l);

        Configuration cfg = new Configuration();
        SessionFactory cf = cfg.configure().buildSessionFactory();
        Session session = cf.openSession();
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
        cf.close();

    }

}
