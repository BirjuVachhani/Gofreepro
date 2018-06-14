package myapplication.uma.gofree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    ImageButton btnreg,btncomp,btnemp,btnloc,btntn,btnmat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnreg = (ImageButton)findViewById(R.id.reg_image);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Register page will be opened", Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(MainActivity.this,MyApplication17.class);
                startActivity(myIntent);
            }
        });


        btncomp = (ImageButton)findViewById(R.id.comp_image);
        btncomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"complaint page will be opened",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, complain.class));
            }
        });

        btnemp = (ImageButton)findViewById(R.id.emp_image);
        btnemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"employment page will be opened",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, ERegister.class));
            }
        });

        btnloc = (ImageButton)findViewById(R.id.loc_image);
        btnloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"location page will be opened",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, location.class));
            }

        });

        btntn = (ImageButton)findViewById(R.id.tn_image);
        btntn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"transportation page will be opened",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Travel.class));

            }
        });

        btnmat = (ImageButton)findViewById(R.id.mat_image);
        btnmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"matrimonial page will be opened",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Matrimony.class));
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    //For option menu bar
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.about:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                break;

            case R.id.contact:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                break;

            case R.id.help:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
