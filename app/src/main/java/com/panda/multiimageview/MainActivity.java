package com.panda.multiimageview;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.panda.library.MultiImageView;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class MainActivity extends AppCompatActivity {

    private List<String> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MultiImageView mImageView = findViewById(R.id.multi_img);
        initData();
        mImageView.setDefaultImage(R.mipmap.ic_launcher);
        mImageView.setList(imageList);
        mImageView.setOnItemClickListener((view, position) -> {
            Toast.makeText(this, "点击了" + position, Toast.LENGTH_SHORT).show();
        });
    }

    private void initData() {
        imageList.add("http://wanxuan.cnki.net/org/images/5f324659a9936d5543566627");
//        imageList.add("http://zkdl.cnki.net/hfsimg/home/file/SJMS201804017_00500?type=jpg");
//        imageList.add("http://wanxuan.cnki.net/zwwh/images/5ecc749ea2a872268457be7d");
//        imageList.add("http://wanxuan.cnki.net/org/images/5f2a640438db1e1c7e19f1c4");
//        imageList.add("http://wanxuan.cnki.net/org/images/5f39f8a538db1e721cb6d1f9");
//        imageList.add("http://wanxuan.cnki.net/zwwh/images/5ea5582a119fa710f4477b73");
//        imageList.add("http://wanxuan.cnki.net/zwwh/images/5ea5582a119fa710f4477b73");
//        imageList.add("http://wanxuan.cnki.net/zwwh/images/5ea5582a119fa710f4477b73");
//        imageList.add("http://wanxuan.cnki.net/zwwh/images/5ea5582a119fa710f4477b73");
    }
}