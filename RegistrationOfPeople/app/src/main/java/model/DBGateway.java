package model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBGateway {
    private static DBGateway dbB;
    private SQLiteDatabase db;

    private DBGateway (Context ctx){
        DBhelper helper = new DBhelper(ctx);
        db = helper.getWritableDatabase();
    }

    public static DBGateway getInstance(Context ctx) {
        if (dbB == null)
            dbB = new DBGateway(ctx);
            return dbB;
    }
    public SQLiteDatabase getDatabase() {
        return this.db;
    }


}
