package com.rameel.helloworld.db.tablesdao;

/**
 * @author Rameel Hassan
 * Created 9/21/21 at 12:13 PM
 */

import androidx.room.Dao;
import androidx.room.Query;

import com.example.roomdb.db.tables.StaffMember;
import com.example.roomdb.db.tables.VehicleStatus;

import java.util.List;
/**
 * @author Rameel Hassan
 * Created 9/21/21 at 12:13 PM
 */
@Dao
public abstract class VehicleStatusDao implements BaseDao<VehicleStatus>{
    /**
     * Get all data from the Data table.
     */
    @Query("SELECT * FROM vehicle_status_table")
    public abstract  List<VehicleStatus> getDataList();
}
