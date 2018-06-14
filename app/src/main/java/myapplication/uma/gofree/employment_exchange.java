package myapplication.uma.gofree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static myapplication.uma.gofree.R.id.bLogout;
import static myapplication.uma.gofree.R.id.cinfo1;
import static myapplication.uma.gofree.R.id.help;
import static myapplication.uma.gofree.R.id.submit;


public class employment_exchange extends ActionBarActivity {

    Button bLogout;
    Button b;

    EditText etName, etAge, etContactinfo, etEmailid, etUsername, etEmploymentTitle;
    EditText name,age,etitle,cinfo,uname,pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employment_exchange);
     /*   final DatabaseReference myRef = FirebaseDatabase.getInstance().getReference().child("complain");
        //name= (EditText) findViewById(R.id.name1);
       // age = (EditText) findViewById(R.id.age1);
       // etitle = (EditText) findViewById(R.id.etitle1);
        cinfo = (EditText) findViewById(R.id.cinfo1);
        uname = (EditText) findViewById(R.id.uname1);
       // pswd = (EditText) findViewById(R.id.pswd1);

        bLogout = (Button)findViewById(submit);

        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myRef.child("cinfo").setValue(cinfo.getText().toString()+"");
                myRef.child("uname").setValue(uname.getText().toString()+""); */


                etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etEmailid = (EditText) findViewById(R.id.etEmail);
        etContactinfo = (EditText) findViewById(R.id.eContactinfo);
        etEmploymentTitle = (EditText) findViewById(R.id.etEmploymentTitle);
        etUsername = (EditText) findViewById(R.id.etUsername);
        bLogout=(Button)findViewById(R.id.bLogout);
        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(employment_exchange.this, Login.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_employment_exchange, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
