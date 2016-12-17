package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.memberapp.R;
import com.hanbit.memberapp.domain.MemberBean;
import com.hanbit.memberapp.service.MemberService;
import com.hanbit.memberapp.service.MemberServiceImp;

import java.util.List;

public class ListActivity extends AppCompatActivity implements View.OnClickListener {


    Button btDetail;
    Button btFind;
    MemberService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        service = new MemberServiceImp(this.getApplicationContext());

        btDetail = (Button) findViewById(R.id.btDetail);
        btDetail.setOnClickListener(this);
        btFind = (Button) findViewById(R.id.btFind);
        btFind.setOnClickListener(this);
        service = new MemberServiceImp(this.getApplicationContext());
        List<MemberBean> list = service.list();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btDetail:
                this.startActivity(new Intent(ListActivity.this, DetailActivity.class));
                break;
            case R.id.btFind:
                this.startActivity(new Intent(ListActivity.this, FindActivity.class));
                break;
        }

    }
}
