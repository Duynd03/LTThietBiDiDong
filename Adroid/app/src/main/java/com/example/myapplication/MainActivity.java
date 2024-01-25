package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // tham chieu toi phan tu tren layout bang id
         tvMain = findViewById(R.id.textview);
         String x= (String) tvMain.getText();
         x += " IT1";
         tvMain.setText(x);
        //tvMain.getText() de doc du lieu cu
        // viet hoa
        // noi them ngay sinh
        // tvMain.setText(Dữ liệu mới)
        //Thiết lập mẫu dữ liệu
    }
    private TextView tvMain;
}
