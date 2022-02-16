package com.example.pantrymind.model.DAO;

import androidx.room.*;

import com.example.pantrymind.model.entity.Reminder;

import java.util.List;

@Dao
public interface ReminderDAO {
    @Insert
    void insert(Reminder reminder);

    @Update
    public void updateReminder(Reminder... reminders);

    @Delete
    void delete(Reminder product);

    @Query("SELECT * FROM reminder")
    List<Reminder> getAll();
}