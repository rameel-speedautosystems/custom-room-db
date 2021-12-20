package com.rameel.helloworld.db.tables;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "vehicle_location_table")
public class VehicleLocation {
    @PrimaryKey
    int id ;
    String name ;

    public VehicleLocation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
