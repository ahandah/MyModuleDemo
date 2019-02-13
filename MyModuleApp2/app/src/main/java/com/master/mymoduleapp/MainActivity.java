package com.master.mymoduleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.master.basecommon.Test;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

//import com.master.mylibrary01.MyLibMainActivity;

@Route(path = "/app/main")
public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);

//        Glide.with(this).load("http://img5.imgtn.bdimg.com/it/u=3365018759,2226705862&fm=26&gp=0.jpg").into(iv);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, MyLibMainActivity.class));
                ARouter.getInstance().build("/app/second").navigation();
            }
        });



    }
}
