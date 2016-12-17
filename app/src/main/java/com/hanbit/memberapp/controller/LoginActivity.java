package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etID, etPass;
    Button btSubmit, btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btSubmit = (Button) findViewById(R.id.btSubmit);
        btCancel = (Button) findViewById(R.id.btCancel);

        btSubmit.setOnClickListener(this);
        btCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /*
        String id = etID.getText().toString();
        int pw = Integer.parseInt(etPass.getText().toString());
        */
        switch (v.getId()){
            case R.id.btSubmit:

            break;
            case R.id.btCancel:
                this.startActivity(new Intent(LoginActivity.this, ListActivity.class));

            break;

        }
    }
}
