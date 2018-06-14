package myapplication.uma.gofree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class location extends ActionBarActivity {

    Button help,donar,needy,rater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        help = (Button)findViewById(R.id.button);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(location.this, Helper.class));
            }
        });
        donar=(Button)findViewById(R.id.button2);
        donar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(location.this,Donar.class));
            }
        });
        needy=(Button)findViewById(R.id.button3);
        needy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(location.this,Needy.class));
            }
        });
        rater=(Button)findViewById(R.id.button4);
        rater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(location.this,Rater.class));
            }
        });
    }
}
