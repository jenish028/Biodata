package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name_txt,moblieno_txt,surname_txt,fname_txt,vilage_txt,age_txt,name1_txt,surname1_txt;
    private TextView education_txt;
    private TextView brithdata_txt;
    private TextView gmail_txt,male_txt;
    private TextView skills1_txt;
    private TextView skills2_txt,skills3_txt;
    private ImageView phone_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();

        String name = getIntent().getStringExtra("n1");
        String surname = getIntent().getStringExtra("n2");
        String fname = getIntent().getStringExtra("n3");
        String village = getIntent().getStringExtra("n4");
        String Age = getIntent().getStringExtra("n5");
        String moblieno = getIntent().getStringExtra("n6");
        String education = getIntent().getStringExtra("n7");
        String brithdata = getIntent().getStringExtra("n8");
        String gmail = getIntent().getStringExtra("n10");
        String gender = getIntent().getStringExtra("n11");
        String skill1 = getIntent().getStringExtra("n12");
        String skill2 = getIntent().getStringExtra("n13");
        String skill3 = getIntent().getStringExtra("n14");



        name_txt.setText(name);
        name1_txt.setText(name);
        surname_txt.setText(surname);
        surname1_txt.setText(surname);
        fname_txt.setText(fname);
        vilage_txt.setText(village);
        age_txt.setText(Age);
        moblieno_txt.setText(moblieno);
        education_txt.setText(education);
        brithdata_txt.setText(brithdata);
        gmail_txt.setText(gmail);
        male_txt.setText(gender);
        skills1_txt.setText(skill1);
        skills2_txt.setText(skill2);
        skills3_txt.setText(skill3);
//        moblieno_txt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String no ="tel:"+moblieno;
//                Intent i=new Intent(Intent.ACTION_CALL);
//                i.setData(Uri.parse(no));
//                startActivity(i);
//            }
//        });
        phone_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no="tel:"+moblieno;
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(no));
                startActivity(i);
            }
        });

    }

    private void blinding() {

        name_txt=findViewById(R.id.name_txt);
        name1_txt=findViewById(R.id.name1_txt);
        surname_txt=findViewById(R.id.sname_txt);
        surname1_txt=findViewById(R.id.sname1_txt);
        fname_txt=findViewById(R.id.fname_txt);
        vilage_txt=findViewById(R.id.vilage_txt);
        age_txt=findViewById(R.id.age_txt);
        moblieno_txt=findViewById(R.id.mobile_txt);
        education_txt=findViewById(R.id.education_txt);
        brithdata_txt=findViewById(R.id.brithdata_txt);
        skills1_txt=findViewById(R.id.skills1_txt);
        skills2_txt=findViewById(R.id.skills2_txt);
        skills3_txt=findViewById(R.id.skills3_txt);
        gmail_txt=findViewById(R.id.gmail_txt);
        male_txt=findViewById(R.id.male_txt);
        phone_img =findViewById(R.id.phone_img);

    }
}