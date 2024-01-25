package com.example.duy_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText EditTextHoTen,EditTextSDT;
    String HoTen,SDT,Que;
    Spinner SpinnerQue;
    Button ButtonAdd;
    ListView ListViewDanhSach;
    RadioGroup RadioGruopGT;
    RadioButton RadioButtonNam,RadioButtonNu;
    ArrayList<CheckBox>  ListCheckBoxHoppy = new ArrayList<CheckBox>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextHoTen = findViewById(R.id.EditTextHoTen);
        EditTextSDT = findViewById(R.id.EditTextSDT);
        SpinnerQue = findViewById(R.id.SpinnerQue);
        RadioGruopGT = findViewById(R.id.RadioGruopGT);
        ButtonAdd= findViewById(R.id.ButtonAdd);
        ListViewDanhSach = findViewById(R.id.ListViewDanhSach);
        ListCheckBoxHoppy.add(findViewById(R.id.checkboxFootball));
        ListCheckBoxHoppy.add(findViewById(R.id.checkboxSwimming));
        ListCheckBoxHoppy.add(findViewById(R.id.checkboxReading));
        //spinner chua thhong tin cac tinh
        SpinnerQue.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item= parent.getItemAtPosition(position).toString();
                Que= parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "Selected Item: " + item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Hà Nội");
        arrayList.add("Thái Bình");
        arrayList.add("Hải Phòng");
        arrayList.add("Nam Định");
        arrayList.add("Bắc Ninh");
        arrayList.add("Thanh Hoá");
        arrayList.add("Hải Dương");
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrayList);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        SpinnerQue.setAdapter(adapter);
        //listview
        ArrayList<String> arrayInformationList= new ArrayList<>();
        ArrayAdapter<String> arrayAdpter = new ArrayAdapter<String>(this, androidx.constraintlayout.widget.
                R.layout.support_simple_spinner_dropdown_item, arrayInformationList);
        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectGenderId= RadioGruopGT.getCheckedRadioButtonId();
                String selectGenderText="";
                if(selectGenderId !=-1){
                    RadioButton selectRadioButton= findViewById(selectGenderId);
                    selectGenderText= selectRadioButton.getText().toString();
                }
                else {
                    // Handle the case when no radio button is select
                }
                String hobby="";
                if (((CheckBox)findViewById(R.id.checkboxFootball)).isChecked())
                {
                    hobby += "Bóng đá ";
                }
                if (((CheckBox)findViewById(R.id.checkboxSwimming)).isChecked())
                {
                    hobby += "Bơi ";
                }

                if (((CheckBox)findViewById(R.id.checkboxReading)).isChecked())
                {
                    hobby += "Đọc sách ";
                }
                String inf =String.format("%s, %s, %s, %s %s",EditTextHoTen.getText().toString(),EditTextSDT.getText().toString(),selectGenderText,Que, hobby);
                arrayInformationList.add(inf);
                ListViewDanhSach.setAdapter(arrayAdpter);
            }
        });
    }
}