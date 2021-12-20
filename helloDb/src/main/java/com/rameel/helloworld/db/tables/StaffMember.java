package com.rameel.helloworld.db.tables;


import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "staff_member_table")
public class StaffMember {
    @PrimaryKey
    int id ;
    String code ;
    String name ;
    String nationalId ;

    public StaffMember(int id, String code, String name, String nationalId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nationalId = nationalId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
