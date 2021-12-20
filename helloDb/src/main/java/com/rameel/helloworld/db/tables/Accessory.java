package com.rameel.helloworld.db.tables;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "accessory_table")
public class Accessory {
    @PrimaryKey
    int id ;
    String code ;
    Date createdDate;

    public Accessory(int id, String code, Date createdDate) {
        this.id = id;
        this.code = code;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}