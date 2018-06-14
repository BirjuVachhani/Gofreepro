package myapplication.uma.gofree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Needy extends AppCompatActivity {

    List<String> time = new ArrayList<String>();
    List<String> need = new ArrayList<String>();
    Spinner spinner_means,spinner_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needy);

        time.add("----Select----");
        time.add("Emergency");
        time.add("Within a week");
        time.add("Within 15 days");
        time.add("Within a month");

        need.add("----Select----");
        need.add("Donation");
        need.add("Educational");
        need.add("Medical");
        need.add("Basic");

        spinner_time = (Spinner) findViewById(R.id.spinner_time);
        spinner_means = (Spinner) findViewById(R.id.spinner_means);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,time);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,need);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_time.setAdapter(arrayAdapter);
        spinner_means.setAdapter(arrayAdapter1);
        Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
//button ka code
                                  }
                              }
        );


    }
}
