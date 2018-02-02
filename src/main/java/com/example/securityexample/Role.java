package com.example.securityexample;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="Idrole")
    private long id;

    @Column(name="Name")
    private String name;

        Role() {}

        public Role(String name) {
            this.name = name;
        }


    public long getIdrole() {
        return id;
    }

    public void setIdrole(long idrole) {
        this.id = idrole;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


