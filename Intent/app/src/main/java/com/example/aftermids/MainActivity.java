package com.example.aftermids;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendAnother = findViewById(R.id.button);
        sendAnother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(send);
            }
        });


        Button Dialer=findViewById(R.id.button2);
        Dialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:+923001234567");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

    }

}