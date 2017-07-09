package com.mahmoud_ashraf.waitlistapp.data;

import android.provider.BaseColumns;

/**
 * Created by mahmoud_ashraf on 7/9/2017.
 */

public class WaitlistContract {
    // add an inner class named WaitlistEntry class that implements the BaseColumns interface
    //it contains _ID primary key by default
    public static final class WaitlistEntry implements BaseColumns {
        // Inside add a static final members for the table name and each of the db columns
        public static final String TABLE_NAME = "waitlist";
        public static final String COLUMN_GUEST_NAME = "guestName";
        public static final String COLUMN_PARTY_SIZE = "partySize";
        public static final String COLUMN_TIMESTAMP = "timestamp";

    }
}
