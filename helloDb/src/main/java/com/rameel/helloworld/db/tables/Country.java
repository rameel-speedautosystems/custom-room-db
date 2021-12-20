package com.rameel.helloworld.db.tables;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "country_table")
public class Country {
    @PrimaryKey
    int id ;
    String code ;

    public Country(int id, String code) {
        this.id = id;
        this.code = code;
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
}
