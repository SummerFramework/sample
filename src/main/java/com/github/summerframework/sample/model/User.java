package com.github.summerframework.sample.model;

import com.github.summerframework.sample.model.valueobject.UserVO;
import com.github.summerframework.core.model.DomainEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by renan on 23/02/16.
 */
@Entity
@Table(name = "User")
public class User extends DomainEntity {

    private String name;

    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Class getVOType() {
        return UserVO.class;
    }
}
