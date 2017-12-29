package com.example.demo.dto;

/**
 * DTO (to communicate through the client)
 * @author matteo.pipitone
 * @version 1.0
 *
 */
public class SkillDto {

    private Integer skillId;
    private String SkillName;

    public SkillDto(Integer skillId, String skillName) {
        this.skillId = skillId;
        SkillName = skillName;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return SkillName;
    }

    public void setSkillName(String skillName) {
        SkillName = skillName;
    }


}
