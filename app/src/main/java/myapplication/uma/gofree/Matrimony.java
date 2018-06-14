package myapplication.uma.gofree;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Matrimony extends ActionBarActivity {

    List<String> profile= new ArrayList<String>();
    List<String>  gender= new ArrayList<String>();
    List<String> category= new ArrayList<String>();
    Spinner ProfileFor,Gender,Category;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrimony);

        profile.add("----Select----");
        profile.add("Self");
        profile.add("Son");
        profile.add("Daughter");

        gender.add("----Select----");
        gender.add("Male");
        gender.add("Female");
        gender.add("other");

        category.add("----Select----");
        category.add("Widow");
        category.add("Divorcy");

        ProfileFor = (Spinner) findViewById(R.id.spinner_ProfileFor);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,profile);

        Gender = (Spinner) findViewById(R.id.spinner_Gender);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,gender);

        Category = (Spinner) findViewById(R.id.spinner_Category);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,category);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ProfileFor.setAdapter(arrayAdapter);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Gender.setAdapter(arrayAdapter1);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Category.setAdapter(arrayAdapter2);

        submit=(Button)findViewById(R.id.button);

    }

}
