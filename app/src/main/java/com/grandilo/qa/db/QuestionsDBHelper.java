package com.grandilo.qa.db;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by calistus on 2/20/2016.
 */
public class QuestionsDBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "questions_warehouse";
    static final String TABLE_QUESTIONS = "questions";
    QuestionsDBHelper DBHelper;
    SQLiteDatabase db;

    //The values of the db fields created above are parsed to the constructor to initialize our DB
    public QuestionsDBHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //This is where we write the code that creates our DB using SQL then parse this query to the db.excSQL()

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //This where we say what happens when we make a change to our database
    }

    //---opens the database---
    public QuestionsDBHelper open() throws SQLException {
        try{
            db = DBHelper.getWritableDatabase();
        }catch (Exception e){e.printStackTrace();}

        return this;
    }

    //---closes the database---
    public void close() {
        DBHelper.close();
    }

    //Reads the questions from the database table
    public Cursor getQuestions(long rowId) throws SQLException {
        Cursor mCursor =
                db.query(true, TABLE_QUESTIONS, new String[]{"id",
                                "questions_set"}, "id" + "=" + rowId, null,
                        null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }


    public Cursor getAnswers(long rowId) throws SQLException {
        Cursor mCursor =
                db.query(true, QuestionContract.AnswersEntries.TABLE_NAME, new String[]{
                                QuestionContract.AnswersEntries.COLUMN_id,
                                QuestionContract.AnswersEntries.COLUMN_ANS1,
                                QuestionContract.AnswersEntries.COLUMN_ANS2,
                                QuestionContract.AnswersEntries.COLUMN_ANS3,
                                QuestionContract.AnswersEntries.COLUMN_ANS4,
                                QuestionContract.AnswersEntries.COLUMN_ANSWER_SET,
                        }, "id" + "=" + rowId, null,
                        null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }
}
