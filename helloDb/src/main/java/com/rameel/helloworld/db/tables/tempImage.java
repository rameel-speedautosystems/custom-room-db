package com.rameel.helloworld.db.tables;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "temp_mark_image_table")
public class tempImage {
    @PrimaryKey
    int id ;

    //unique
    String guid ;
    String path ;
    int sync_status ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSync_status() {
        return sync_status;
    }

    public void setSync_status(int sync_status) {
        this.sync_status = sync_status;
    }
}
