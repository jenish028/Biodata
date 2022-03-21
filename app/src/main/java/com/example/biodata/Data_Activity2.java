package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Data_Activity2 extends AppCompatActivity {

    private Button done_btn;
    private EditText name_edt,village_edt;
    private EditText surname_edt,fname_edt,mobileno_edt,education_edt;
    private EditText brithdata_edt;
    private EditText gmail_edt;
    private RadioGroup rg_group;
    private RadioButton male_rg_btn,female_rg_btn;
    private CheckBox movie_chk,reading_chk,dancing_chk;
    private TextView age1_txt;
    private SeekBar age_seek;
    String gender,dancing,movie,reading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);

        blinding();

        reading_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    reading = "Reading";
                } else {
                    reading = "";
                }

            }
        });

        movie_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    movie="Movie";
                }
                else
                {
                    movie="";
                }
            }
        });
        dancing_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    dancing="Dancing";
                }
                else
                {
                    dancing="";
                }
            }
        });

        age_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                age1_txt.setText(""+i);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=name_edt.getText().toString();
                String surname=surname_edt.getText().toString();
                String fname=fname_edt.getText().toString();
                String village=village_edt.getText().toString();
                String age=age1_txt.getText().toString();
                String mobile=mobileno_edt.getText().toString();
                String education=education_edt.getText().toString();
                String brithdata=brithdata_edt.getText().toString();
                String gmail= gmail_edt.getText().toString();
                if(rg_group.getCheckedRadioButtonId()==R.id.male_rg_btn)
                {
                    gender="Male";
                }
                else if(rg_group.getCheckedRadioButtonId()==R.id.female_rg_btn)
                {
                    gender="Female";
                }
                if(name_edt.getText().length()==0)
                {
                        name_edt.setError("Enter the Name");
                }
                else if(surname_edt.getText().length()==0)
                {
                    surname_edt.setError("Enter The surname");
                }
                else if(fname_edt.getText().length()==0)
                {
                    fname_edt.setError("Enter The Father Name");
                }
               else if(village_edt.getText().length()==0)
                {
                    village_edt.setError("Enter The village Name");
                }

               else if(mobileno_edt.getText().length()==0)
                {
                    mobileno_edt.setError("Enter The Moblie No.");
                }
                else if(education_edt.getText().length()==0)
                {
                    education_edt.setError("Enter The Education");
                }
                else if(brithdata_edt.getText().length()==0)
                {
                    brithdata_edt.setError("Enter The Brith Data");
                }

                else if(gmail_edt.getText().length()==0)
                {
                    gmail_edt.setError("Enter The gmail(");
                }
                else if(age1_txt.getText().length()==0)
                {
                    age1_txt.setError("Enter Age");
                }
                //   Toast.makeText(Data_Activity2.this, name+"\n"+surname+"\n"+fname+"\n"+village+"\n"+age+"\n"+mobile, Toast.LENGTH_SHORT).show();
            else{
                Intent intent = new Intent(Data_Activity2.this,MainActivity.class);
                    intent.putExtra("n1",name);
                    intent.putExtra("n2",surname);
                    intent.putExtra("n3",fname);
                    intent.putExtra("n4",village);
                    intent.putExtra("n5",age);
                    intent.putExtra("n6",mobile);
                    intent.putExtra("n7",education);
                    intent.putExtra("n8",brithdata);
                    intent.putExtra("n10",gmail);
                    intent.putExtra("n11",gender);
                    intent.putExtra("n12",reading);
                    intent.putExtra("n13",movie);
                    intent.putExtra("n14",dancing);

                    startActivity(intent);
                }
            }
        });
    }
    private void blinding() {
        done_btn=findViewById(R.id.done_btn);
        name_edt=findViewById(R.id.name_edt);
        surname_edt=findViewById(R.id.surname_edt);
        fname_edt=findViewById(R.id.fname_edt);
        rg_group=findViewById(R.id.rg_group);
        male_rg_btn=findViewById(R.id.male_rg_btn);
        female_rg_btn=findViewById(R.id.female_rg_btn);
        village_edt=findViewById(R.id.village_edt);
        mobileno_edt=findViewById(R.id.mobileno_edt);
        education_edt=findViewById(R.id.education_edt);
        brithdata_edt=findViewById(R.id.brithdata_edt);
        age_seek=findViewById(R.id.age_seek);
        age1_txt=findViewById(R.id.age1_txt);
        gmail_edt=findViewById(R.id.gmail_edt);
        reading_chk=findViewById(R.id.reading_chk);
        movie_chk=findViewById(R.id.movie_chk);
        dancing_chk=findViewById(R.id.dancing_chk);
    }
    }