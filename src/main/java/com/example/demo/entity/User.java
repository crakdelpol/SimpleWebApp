package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Entity (to communicate through the DB).
 * @author matteo.pipitone
 * @version 1.0
 * @since 12-27-2017
 */
@Entity
public class User implements Serializable{

    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer userId;

    @Column
    private String userName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Skill> skills = new LinkedList<>();


    public User(){

        this(null, null);
    }

    public User(String userName, List<Skill> skills){
        this.skills= skills;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
