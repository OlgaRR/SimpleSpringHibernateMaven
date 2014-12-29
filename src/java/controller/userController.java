/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import service.UserDAO;

/**
 *
 * @author Olya
 */
public class userController implements Controller {
    List<User> lts;
    UserDAO udao = new UserDAO();
    @Override    
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
    
        ModelAndView mv = new ModelAndView("user");
      
      try {
       lts = this.udao.layDS();
       mv.addObject("userlist",lts);
       mv.addObject("u", 1);
      }
      catch(Exception e){
       System.out.println("O o ou");
       mv.addObject("u", e);
      }
        for (User lt : lts) {
            System.out.println(lt.getName());
        }
      System.out.println("La la la");
      return mv;
    }
    
}
