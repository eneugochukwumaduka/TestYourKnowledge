package com.grandilo.qa.db;

import android.provider.BaseColumns;

/**
 * Created by calistus on 2/20/2016.
 */
public class QuestionContract {
    public static final class QuestionsEntries implements BaseColumns{

        public static final String TABLE_NAME ="questions";
        public static final String COLUMN_id = "id";
        public static final String COLUMN_QUESTION_SET = "questions_set";
    }
    public static final class AnswersEntries implements BaseColumns{

        public static final String TABLE_NAME ="answer";
        public static final String COLUMN_id = "id";
        public static final String COLUMN_ANS1 = "ans1";
        public static final String COLUMN_ANS2 = "ans2";
        public static final String COLUMN_ANS3 = "ans3";
        public static final String COLUMN_ANS4 = "ans4";
        public static final String COLUMN_ANSWER_SET = "answer_set";


    }
}
