package hk.com.kycheungal.girlsfrontline.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import hk.com.kycheungal.girlsfrontline.Adapter.GirlAdapter;
import hk.com.kycheungal.girlsfrontline.DatabaseHelper;
import hk.com.kycheungal.girlsfrontline.R;
import hk.com.kycheungal.girlsfrontline.module.GirlData;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    DatabaseHelper myDB;
    Button btn_add;

    private RecyclerView recView;
    private GirlAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB = new DatabaseHelper(this);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        recView = (RecyclerView)findViewById(R.id.rec_list);
        //Check out GridLayoutManager and StaggeredGridLayoutManager for more options
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new GirlAdapter(GirlData.getListData(), this);
        recView.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add:
                Intent addIntent = new Intent(this, AddNewGirlActivity.class);
                startActivity(addIntent);
        }
    }
}
