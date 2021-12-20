package com.rameel.helloworld.db.tablesdao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.roomdb.db.tables.MarkImage;
import com.example.roomdb.db.tables.tempImage;

import java.util.List;

/**
 * @author Rameel Hassan
 * Created 9/21/21 at 12:13 PM
 */
@Dao
public abstract class TempImageDao implements BaseDao<tempImage>{
    /**
     * Get all data from the Data table.
     */
    @Query("SELECT * FROM temp_mark_image_table")
    public abstract List<tempImage> getDataList();
}
