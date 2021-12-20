package com.rameel.helloworld.db.tablesdao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.roomdb.db.tables.Country;
import com.example.roomdb.db.tables.StaffMember;

import java.util.List;
/**
 * @author Rameel Hassan
 * Created 9/21/21 at 12:13 PM
 */
@Dao
public abstract class CountryDao implements BaseDao<Country>{
    /**
     * Get all data from the Data table.
     */
    @Query("SELECT * FROM country_table")
    public abstract List<Country> getDataList();

    /**
     * Get signle list from the Data table.
     */
    @Query("SELECT * FROM country_table order by id")
    public abstract List<Country> getSortedDataList();
}
