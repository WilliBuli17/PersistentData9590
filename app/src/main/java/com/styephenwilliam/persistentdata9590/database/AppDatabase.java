package com.styephenwilliam.persistentdata9590.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.styephenwilliam.persistentdata9590.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
