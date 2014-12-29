package model;
// Generated 25.12.2014 18:20:42 by Hibernate Tools 4.3.1

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import java.util.Date;
import javax.persistence.Temporal;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user")
public class User  implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     private String name;
     private Integer age;
     private Boolean isAdmin;
    @Temporal(javax.persistence.TemporalType.DATE)
     private Date createdDate;

    public User() {
    }

    public User(String name, Integer age, Boolean isAdmin, Date createdDate) {
       this.name = name;
       this.age = age;
       this.isAdmin = isAdmin;
       this.createdDate = createdDate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }
    
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }




}


