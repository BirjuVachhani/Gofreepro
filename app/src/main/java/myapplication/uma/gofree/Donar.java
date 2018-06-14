package myapplication.uma.gofree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Donar extends AppCompatActivity {
    private RadioGroup visible;
    private RadioButton visible_button;
    private Button submit;
    List<String>  d= new ArrayList<String>();
    Spinner spinner_person;
  EditText help,donate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donar);
        /*final DatabaseReference myRef = FirebaseDatabase.getInstance().getReference().child("complain");
         help= (EditText) findViewById(R.id.help1);
        donate = (EditText) findViewById(R.id.donate1);
        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myRef.child("help").setValue(help.getText().toString()+"");
                myRef.child("donate").setValue(donate.getText().toString()+"");*/



                d.add("----Select----");
        d.add("Poor");
        d.add("Old people");
        d.add("Orphan children");
        d.add("Students");

        spinner_person = (Spinner) findViewById(R.id.spinner_person);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,d);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_person.setAdapter(arrayAdapter);

        visible =(RadioGroup)findViewById(R.id.visible);

        submit=(Button)findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=visible.getCheckedRadioButtonId();
                visible_button=(RadioButton)findViewById(selectedId);
                Toast.makeText(Donar.this,visible_button.getText(),Toast.LENGTH_SHORT).show();
            }
        });
      /*  public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_pirates:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_ninjas:
                    if (checked)
                        // Ninjas rule
                        break;
            }
        }
*/
    }
}
