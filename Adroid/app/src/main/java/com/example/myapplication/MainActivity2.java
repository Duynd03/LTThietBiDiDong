package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    protected EditText txtName;
    protected FloatingActionButton btnAdd;
    protected ListView lstStudent;
    protected ArrayAdapter adapter;
    protected ArrayList listName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //tham chieu toi cac view tren giao dien
        txtName= findViewById(R.id.txtName);
        btnAdd=findViewById(R.id.btnAdd);
        lstStudent = findViewById(R.id.lstStudent);
        //tao array luu danh sach cac ho ten sinh vien
        listName= new ArrayList();
        listName.add("Nguyen Dinh Duy");
        listName.add("Nguyen Hai Dang");
        listName.add("Nguyen Thi Tam");
        //Tao adapter
        //tham so 1 context lop cha cua lop Activity
        //ts2 : layout cua 1 phan tu
        //ts 3: arraylist chua du lieu danh sach sinh vien
        adapter = new ArrayAdapter(context:this, adroidx.appcompat.R.layout.support_simple)
    }


    }
}