package com.rameel.helloworld.db.tablesdao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.roomdb.db.tables.StaffMember;

import java.util.List;
/**
 * @author Rameel Hassan
 * Created 9/21/21 at 12:13 PM
 */
@Dao
public abstract class StaffMemberDao implements BaseDao<StaffMember>{
    /**
     * Get all data from the Data table.
     */
    @Query("SELECT * FROM staff_member_table")
    public abstract List<StaffMember> getDataList();
}
