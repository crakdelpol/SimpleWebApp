package com.example.demo.entity;

import javax.persistence.*;

/**
 * Entity (to communicate through the DB).
 * @author matteo.pipitone
 * @version 1.0
 * @since 12-27-2017
 */
@Entity
public class Skill {
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer skillId;

    @Column
    private String skillName;

    @ManyToOne
    private User user;

    public Skill(){
        this(null, null);
    }

    public Skill(String skillName){

        this(skillName, null);
    }

    public Skill(String skillName, User user){
        this.skillName = skillName;
        this.user = user;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
