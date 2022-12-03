/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Notetaker.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.Random;



@Entity
@Table(name = "Notes")
public class Note   {
   @Id
   private int id;
   
   
   private String title;
   @Column(length=1500)
   private String content;
   private  Date sqlDate;

    public Note(String title, String content, Date sqlDate) {
        this.id=new Random().nextInt(100000);
        this.title = title;
        this.content = content;
        this.sqlDate = sqlDate;
    }

    public Note() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the sqlDate
     */
    public  Date getSqlDate() {
        return sqlDate;
    }

   
    public void setSqlDate(Date sqlDate) {
        this.sqlDate = sqlDate;
    }

}