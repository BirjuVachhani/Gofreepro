package myapplication.uma.gofree;


import android.*;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class complain extends ActionBarActivity {

    List<String> l=new ArrayList<>();
    Spinner spinner_category;
    Button submit;
    EditText comp_title,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);
        final DatabaseReference myRef = FirebaseDatabase.getInstance().getReference().child("complain");

        comp_title = (EditText) findViewById(R.id.complain_title);
        desc = (EditText) findViewById(R.id.complain);
        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myRef.child("Complain_title").setValue(comp_title.getText().toString()+"");
                myRef.child("Complain_desc").setValue(desc.getText().toString()+"");

            }
        });




        l.add("select option");
        l.add("Dowry");
        l.add("Abuse");
        l.add("Transport");
        l.add("Muncipality");
        l.add("Education");
        l.add("Study");

        spinner_category = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,l);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_category.setAdapter(arrayAdapter);

        submit=(Button)findViewById(R.id.button);
    }
    void call()
    {
        Intent i = new Intent((Intent.ACTION_CALL));
        i.setData(Uri.parse("tel:8347593988"));
        startActivity(i);
    }
}
