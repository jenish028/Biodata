package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Data_Activity2 extends AppCompatActivity {

    private Button done_btn;
    private EditText name_edt,age_edt,village_edt;
    private EditText surname_edt,fname_edt,mobileno_edt,education_edt;
    private EditText brithdata_edt;
    private EditText skills_edt;
    private EditText gmail_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);
        blinding();

        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=name_edt.getText().toString();
                String surname=surname_edt.getText().toString();
                String fname=fname_edt.getText().toString();
                String village=village_edt.getText().toString();
                String age=age_edt.getText().toString();
                String mobile=mobileno_edt.getText().toString();
                String education=education_edt.getText().toString();
                String brithdata=brithdata_edt.getText().toString();
                String skills=skills_edt.getText().toString();
                String gmail=gmail_edt.getText().toString();

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
               else if(age_edt.getText().length()==0)
                {
                    age_edt.setError("Enter The age Name");
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
                else if(skills_edt.getText().length()==0)
                {
                    skills_edt.setError("Enter The skills");
                }
                else if(gmail_edt.getText().length()==0)
                {
                    gmail_edt.setError("Enter The gmail(");
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
                    intent.putExtra("n9",skills);
                    intent.putExtra("n10",gmail);

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
        age_edt=findViewById(R.id.age_edt);
        village_edt=findViewById(R.id.village_edt);
        mobileno_edt=findViewById(R.id.mobileno_edt);
        education_edt=findViewById(R.id.education_edt);
        brithdata_edt=findViewById(R.id.brithdata_edt);
        skills_edt=findViewById(R.id.skills_edt);
        gmail_edt=findViewById(R.id.gmail_edt);

    }
}