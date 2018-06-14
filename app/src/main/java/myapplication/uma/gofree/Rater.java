package myapplication.uma.gofree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Rater extends AppCompatActivity {

    List<String> rate = new ArrayList<String>();
    List<String> act = new ArrayList<String>();
    Spinner spinner_rater,spinner_act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rater);

        rate.add("----Select----");
        rate.add("Abuse");
        rate.add("Child Trafficking");
        rate.add("Muncipality");
        rate.add("Transport");
        rate.add("Undeveloped");

        act.add("----Select----");
        act.add("Strict");
        act.add("Moderate");
        act.add("Warning");

        spinner_rater = (Spinner) findViewById(R.id.spinner_rater);
        spinner_act = (Spinner) findViewById(R.id.spinner_act);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,rate);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,act);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_rater.setAdapter(arrayAdapter);
        spinner_act.setAdapter(arrayAdapter1);
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
