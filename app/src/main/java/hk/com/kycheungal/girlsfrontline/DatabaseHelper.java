package hk.com.kycheungal.girlsfrontline;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fujitsu on 19/3/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "GirlsFrontLine.db";
    public static final String Table_Name = "Girls_table";
    public static final String Col_1 = "ID";
    public static final String Col_2 = "Lv";
    public static final String Col_3 = "No of people";
    public static final String Col_4 = "Skill Lv";



    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + Table_Name + "(ID INTEGER PRIMARY KEY, Lv INTEGER, NO_OF_PEOPLE INTEGER, SKILL_LV INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST " + Table_Name);
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(int lv, int noOfPeople, int skillLv) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Col_2, lv);
        contentValues.put(Col_3, noOfPeople);
        contentValues.put(Col_4, skillLv);
        Long result = sqLiteDatabase.insert(Table_Name, null, contentValues);
        if (result == -1) return false;
        else return true;
    }
}
