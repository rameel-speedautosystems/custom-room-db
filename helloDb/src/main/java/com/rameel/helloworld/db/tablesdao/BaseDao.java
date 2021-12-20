package com.rameel.helloworld.db.tablesdao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.roomdb.db.tables.Country;

/**
 * @author Rameel Hassan
 * Created 9/21/21 at 12:13 PM
 */
public interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(T data);

    @Insert
    void insertAll(T... dataList);

    @Delete
    void delete(T data);

    @Delete
    void deleteList(T... data);

    @Update
    void update(T data);


}
