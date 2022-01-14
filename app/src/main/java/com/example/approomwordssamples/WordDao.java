package com.example.approomwordssamples;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Insert(onConflict = OnConflictStrategy.IGNORE)


    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from word_table LIMIT 1")
    Word[] getAnyWord();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

    @Delete
    void deleteWord(Word word);

}

