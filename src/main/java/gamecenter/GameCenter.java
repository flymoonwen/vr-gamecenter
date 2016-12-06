package gamecenter;


import gamecenter.db.entity.ArmorEntity;
import gamecenter.db.entity.PlayerDataEntity;
import gamecenter.db.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by MooN on 2016-11-24.
 */
public class GameCenter {

    public static void main(String[] args) {


        PlayerDataEntity playerDataEntity = new PlayerDataEntity();
        playerDataEntity.setPlayerId(111);
        playerDataEntity.setUsername("test111");

        Configuration cfg = new Configuration();
        SessionFactory cf = cfg.configure().buildSessionFactory();
        Session session = cf.openSession();
        session.beginTransaction();
        session.save(playerDataEntity);
        session.getTransaction().commit();
        session.close();
        cf.close();

    }

}
