package hk.com.kycheungal.girlsfrontline.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import hk.com.kycheungal.girlsfrontline.R;

public class AddNewGirlActivity extends AppCompatActivity {

    Button button_add, button_cancel;
    Spinner spinner_Skill_LV;
    EditText edit_name, edit_lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_girl);

        //Title
        this.setTitle("新增槍娘");

        //spinner
        spinner_Skill_LV = (Spinner) findViewById(R.id.spinner_Skill_LV);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array_skill_lv, R.layout.spinner_item);
        adapter.setDropDownViewResource( R.layout.spinner_item);
        spinner_Skill_LV.setAdapter(adapter);

        //button
        button_add = (Button) findViewById(R.id.button_add);
        button_cancel = (Button) findViewById(R.id.button_cancel);

        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Edit text
        edit_lv = (EditText) findViewById(R.id.edit_lv);
        edit_name = (EditText) findViewById(R.id.edit_name);


    }
}
