package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class FindActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etID;
    Button btSearch, btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        btSearch = (Button) findViewById(R.id.btSearch);
        btCancel= (Button) findViewById(R.id.btCancel);

        btSearch.setOnClickListener(this);
        btCancel.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        //String id = etID.getText().toString();

        switch (v.getId()){
            case R.id.btSearch :
                break;

            case R.id.btCancel :
                this.startActivity(new Intent(FindActivity.this, ListActivity.class));
                break;


        }
    }
}
