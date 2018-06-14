package myapplication.uma.gofree;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

    public class Helper extends Activity {

        List<String> type = new ArrayList<String>();
        List<String> help = new ArrayList<String>();
        Spinner spinner,spinner_help;
        String Dept;

        RelativeLayout NGO_detail,vol_detail,address;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_helper);

            help.add("----Select----");
            help.add("Care taking");
            help.add("Medical Help");
            help.add("Organizing");
            help.add("Child Care");
            help.add("Support");

            type.add("----Select----");
            type.add("NGO");
            type.add("Vol");

            Button b1=(Button)findViewById(R.id.button);
            b1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                      }
                                  }
            );

            NGO_detail = (RelativeLayout) findViewById(R.id.NGO_detail);

            vol_detail = (RelativeLayout) findViewById(R.id.vol_detail);

            address = (RelativeLayout) findViewById(R.id.address_helper);

            spinner = (Spinner) findViewById(R.id.spinner_helper);
            spinner_help = (Spinner) findViewById(R.id.spinner_helper_type);

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1,type);
            ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1,help);

            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner.setAdapter(arrayAdapter);
            spinner_help.setAdapter(arrayAdapter1);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Dept = type.get(position).toString();
                    if(Dept.equals("NGO"))
                    {
                        NGO_detail.setVisibility(View.VISIBLE);
                        vol_detail.setVisibility(View.GONE);
                    }
                    else if(Dept.equals("Vol"))
                    {
                        vol_detail.setVisibility(View.VISIBLE);
                        NGO_detail.setVisibility(View.GONE);
                    }
                    else
                    {
                        vol_detail.setVisibility(View.GONE);
                        NGO_detail.setVisibility(View.GONE);
                    }
                }


                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

        }
    }



