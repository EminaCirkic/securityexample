package com.example.securityexample;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Emina on 4/22/2017.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Iduser")
    private long iduser;

    @Column(name = "Userurl")
    private String userurl;

    @Column(name="Name")
    private String name;

    @Column(name="Password")
    private String password;

    @Column(name="Profilescore")
    private int profilescore;

    @Column(name = "Date")
    private Timestamp date;

    @Column(name = "Lastactive")
    private Timestamp lastactive;

    @Column(name = "Lasteditedprofile")
    private Timestamp lasteditedprofile;

    @Column(name = "Email")
    private String email;

    @Column(name = "Description")
    private String description;

    @Column(name = "Loggedinip")
    private String loggedinip;

    @Column(name="Numberofquestions")
    private int numberofquestions;

    @Column(name = "Answerscore")
    private int answerscore;

    @ManyToOne
    @JoinColumn(name = "Roleidrole", referencedColumnName = "Idrole")
    private Role role;

    public User(){

    }
    //
    public User(String userurl, String name, String password, int profilescore, Timestamp date, Timestamp lastactive, Timestamp lasteditedprofile, String email, String description, String loggedinip, int numberofquestions, int answerscore, Role role) {
        this.userurl = userurl;
        this.name = name;
        this.password = password;
        this.profilescore = profilescore;
        this.date = date;
        this.lastactive = lastactive;
        this.lasteditedprofile = lasteditedprofile;
        this.email = email;
        this.description = description;
        this.loggedinip = loggedinip;
        this.numberofquestions = numberofquestions;
        this.answerscore = answerscore;
        this.role=role;
    }

    public long getIduser() {
        return iduser;
    }

    public void setIduser(long iduser) {
        this.iduser = iduser;
    }

    public String getUserurl() {
        return userurl;
    }

    public void setUserurl(String username) {
        this.userurl = userurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfilescore() {
        return profilescore;
    }

    public void setProfilescore(int profilescore) {
        this.profilescore = profilescore;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {

        this.date = date;
    }

    public Timestamp getLastactive() {
        return lastactive;
    }

    public void setLastactive(Timestamp lastactive) {
        this.lastactive = lastactive;
    }

    public Timestamp getLasteditedprofile() {
        return lasteditedprofile;
    }

    public void setLasteditedprofile(Timestamp lasteditedprofile) {
        this.lasteditedprofile = lasteditedprofile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLoggedinip() {
        return loggedinip;
    }

    public void setLoggedinip(String loggedinip) {
        this.loggedinip = loggedinip;
    }

    public int getNumberofquestions() {
        return numberofquestions;
    }

    public void setNumberofquestions(int numberofquestions) {
        this.numberofquestions = numberofquestions;
    }

    public int getAnswerscore() {
        return answerscore;
    }

    public void setAnswerscore(int answerscore) {
        this.answerscore = answerscore;
    }

    public Role getRole(){
        return role;
    }

    public void setRole(Role role){
        this.role=role;
    }
}
