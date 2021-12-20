package com.rameel.helloworld.db;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Insert;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.roomdb.db.tables.Accessory;
import com.example.roomdb.db.tables.Country;
import com.example.roomdb.db.tables.MarkImage;
import com.example.roomdb.db.tables.StaffMember;
import com.example.roomdb.db.tables.VehicleLocation;
import com.example.roomdb.db.tables.VehicleStatus;
import com.example.roomdb.db.tables.tempImage;
import com.example.roomdb.db.tablesdao.AccessoryDao;
import com.example.roomdb.db.tablesdao.BaseDao;
import com.example.roomdb.db.tablesdao.CountryDao;
import com.example.roomdb.db.tablesdao.MarkImageDao;
import com.example.roomdb.db.tablesdao.TempImageDao;
import com.example.roomdb.db.tablesdao.VehicleLocationDao;

import kotlin.jvm.Volatile;

/**
 * @author Rameel Hassan
 * Created 9/21/21 at 12:13 PM
 */


@Database(entities = { Accessory.class,Country.class, MarkImage.class,  StaffMember.class, VehicleLocation.class,VehicleStatus.class, tempImage.class}
, version = DBConstants.VERSION)
@TypeConverters(Convertors.class)
public abstract class CustomDatabase extends RoomDatabase {

    public abstract CountryDao getCountryDao();
    public abstract AccessoryDao getAccessoryDao();
    public abstract MarkImageDao getMarkImageDao();
    public abstract TempImageDao getempImageDao();
    public abstract VehicleLocationDao getVehicleLocationDao();



    @Volatile
    private static CustomDatabase noteDB;

    public CustomDatabase getInstance(Context context) {
       synchronized (this){
        if (null == noteDB) {
            noteDB = buildDatabaseInstance(context);
        }
        return noteDB;
       }
    }

    private static CustomDatabase buildDatabaseInstance(Context context) {

        Migration migration_1_2 = new Migration(1,2){
            @Override
            public void migrate(@NonNull SupportSQLiteDatabase database) {
                database.execSQL("Alter TABLE Accessory ADD COLUMN isActive INTEGER NOT NULL DEFAULT(1) ");
            }
        };

       


        return Room.databaseBuilder(context.getApplicationContext(),
                CustomDatabase.class,
                DBConstants.DB_NAME)
//                .addMigrations(migration_1_2)
                .build();
    }

}