package com.tkkd.mealplanner.Database.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "measures")
public class Measure {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "measure_name")
    public String mesName;

    @NonNull
    public String toString(){
        return mesName;
    }
}
