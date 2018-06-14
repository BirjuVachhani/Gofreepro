package myapplication.uma.gofree;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Travel extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

       b = (Button)findViewById(R.id.call);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            call();
            }

            private void call() {
                Intent i = new Intent((Intent.ACTION_CALL));
                i.setData(Uri.parse("tel:8347593988"));
                startActivity(i);
            }
        });


    }
}
