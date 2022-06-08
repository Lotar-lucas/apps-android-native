package model;


import android.content.ContentValues;
import android.content.Context;

public class RegistrationDao {
    private static String TABLE_NAME = "PEOPLE";
    private  DBGateway dbG;

    public RegistrationDao(Context ctx) {
        this.dbG = DBGateway.getInstance(ctx);
    }

    public boolean save(Registration registration) {
        ContentValues cv = new ContentValues();

        cv.put("NAME", registration.getName());
        cv.put("SOCIALNAME", registration.getSocialName());
        cv.put("GENRE", registration.getGenre());
        cv.put("FATHER", registration.getFatherName());
        cv.put("MOTHER", registration.getMotherName());
        cv.put("INCOME", registration.getIncome());

        return this.dbG.getDatabase().insert(TABLE_NAME, null, cv) > 0;
    }
}
