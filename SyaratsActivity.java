package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SyaratsActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton next;
    ImageButton prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarats);
        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (SyaratsActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent SyaratActivityIntent = new Intent (SyaratsActivity.this, SyaratActivity.class);
                startActivity (SyaratActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent BolehActivityIntent = new Intent (SyaratsActivity.this, BolehActivity.class);
                startActivity (BolehActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(SyaratsActivity.this,R.raw.backsound);
        backsound.start();

    }
}
