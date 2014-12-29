/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.SQLException;
import java.util.List;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import javax;

/**
 *
 * @author Olya
 */
public class UserDAO {
   @Autowired
    @Qualifier(value = "sessionFactory")
   // @Inject
   private SessionFactory sf;
    
    public  List<User> layDS() throws SQLException {
        List<User> lst =null;  
        String htl;
        Query q;
    try 
    {
      q=  sf.getCurrentSession().createQuery("from User");
       //q = sf.openSession().createQuery("from User");
        
//        // = sf.createQuery(htl);
      lst =q.list();
//        sf.close();
    }
    catch(Exception e)
    {}
      //  return sf.getCurrentSession().createQuery("from User").list();
    return lst ;
}
}
    

