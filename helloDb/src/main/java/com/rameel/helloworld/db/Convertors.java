package com.rameel.helloworld.db;

import androidx.room.TypeConverter;

import java.util.Date;

/**
 * @author Rameel Hassan
 * Created 9/22/21 at 12:47 PM
 *
 * save custom data type in table
 * i.e Date
 */

public class Convertors {

    @TypeConverter
    public long fromDateToLong(Date date){
       return date.getTime();
    }

    @TypeConverter
    public Date fromLongToDate(long time){
        return new Date(time);
    }
}
