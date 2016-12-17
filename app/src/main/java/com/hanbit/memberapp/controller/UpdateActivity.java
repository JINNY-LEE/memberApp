package com.hanbit.memberapp.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hanbit.memberapp.R;

public class UpdateActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvID, tvPass, tvName, tvTel, tvAddr;
    Button btCall, btMap, btMessage, btUpdate, btDelete, btList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btCall = (Button) findViewById(R.id.btCall);
        btMap = (Button) findViewById(R.id.btMap);
        btMessage = (Button) findViewById(R.id.btMessage);
        btUpdate = (Button) findViewById(R.id.btUpdate);
        btDelete = (Button) findViewById(R.id.btDelete);
        btList = (Button) findViewById(R.id.btList);

        btCall.setOnClickListener(this);
        btMap.setOnClickListener(this);
        btMessage.setOnClickListener(this);
        btUpdate.setOnClickListener(this);
        btDelete.setOnClickListener(this);
        btList.setOnClickListener(this);

        tvID = (TextView) findViewById(R.id.tvID);
        tvPass = (TextView) findViewById(R.id.tvPass);
        tvName = (TextView) findViewById(R.id.tvName);
        tvTel = (TextView) findViewById(R.id.tvTel);
        tvAddr = (TextView) findViewById(R.id.tvAddr);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btCall:
                break;
            case R.id.btMap:
                break;
            case R.id.btMessage:
                break;
            case R.id.btUpdate:
                break;
            case R.id.btDelete:
                break;
            case R.id.btList:
                break;
        }

    }
}
