package com.rameel.helloworld.db.tablesdao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.roomdb.db.tables.Accessory;
import com.example.roomdb.db.tables.StaffMember;

import java.util.List;
/**
 * @author Rameel Hassan
 * Created 9/21/21 at 12:13 PM
 */
@Dao
public abstract class AccessoryDao implements BaseDao<Accessory> {
    /**
     * Get all data from the Data table.
     */
    @Query("SELECT * FROM accessory_table")
    public abstract List<Accessory> getDataList();
}