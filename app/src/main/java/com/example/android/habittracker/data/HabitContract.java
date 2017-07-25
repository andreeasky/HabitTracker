package com.example.android.habittracker.data;

import android.provider.BaseColumns;

public class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {
    }

    /**
     * Inner class that defines constant values for the Habit Tracker database table.
     * Each entry in the table represents a single Habit event.
     */
    public static final class HabitEntry implements BaseColumns {

        /**
         * Name of database table for habits
         */
        public final static String TABLE_NAME = "habit_tracker";

        /**
         * Name of the Habit.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_NAME = "name";

        /**
         * Minutes of Exercise for the Habit event.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_EXERCISE_MINUTES = "minutes";

        /**
         * Date of the Habit event.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_DATE = "date";

        /**
         * Result of the Habit event.
         * <p>
         * The only possible values are: GOAL ACHIEVED, GOAL NOT ACHIEVED
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_RESULT = "result";
    }
}
