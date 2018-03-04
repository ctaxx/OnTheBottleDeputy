package com.bottle.user.test;

import com.bottle.user.model.DAO.UserDAOImpl;
import com.bottle.user.model.entity.UsersEntity;
import com.bottle.user.model.hibernate.HibernateSessionFactory;
import org.hibernate.Session;

import java.sql.SQLException;

public class TestApp {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

      /*  Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        UsersEntity userEntity = new UsersEntity();

        userEntity.setId(3);
        userEntity.setAge(15);
        userEntity.setName("Nick");
        userEntity.setSurname("VN");
        userEntity.setEmail("email@email.com");
        userEntity.setPassword("111");
        userEntity.setAvatarUrl("www.user.com");
        userEntity.setLogin("user");
        userEntity.setCity("my city");
        userEntity.setCountry("my country");

        session.save(userEntity);
        session.getTransaction().commit();

        session.close();*/

        UserDAOImpl userDAO = new UserDAOImpl();
        UsersEntity user = null;

        user = (UsersEntity)userDAO.getEntityByID(3);


//        System.out.println("A name of user is " + user.getName());

    }
}
