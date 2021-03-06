package com.example.layoutdemo.ContentProvider;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.layoutdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by luffy on 2016/8/1.
 */
public class MyCpActivity extends AppCompatActivity {
    @BindView(R.id.btn_select)
    Button btnSelect;

    @BindView(R.id.btn_deleteall)
    Button btnDeleteall;
    @BindView(R.id.btn_insert)
    Button btnInsert;
    @BindView(R.id.btn_update)
    Button btnUpdate;
    @BindView(R.id.listView)
    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycontentprovider);
    }

    @OnClick({R.id.btn_select, R.id.btn_deleteall, R.id.btn_insert, R.id.btn_update})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_select:
                break;
            case R.id.btn_deleteall:
                break;
            case R.id.btn_insert:
                break;
            case R.id.btn_update:
                break;
        }
    }
}
