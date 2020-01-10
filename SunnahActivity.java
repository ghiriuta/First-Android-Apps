package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SunnahActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton t_baca;
    ImageButton next;
    ImageButton prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (SunnahActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        t_baca = (ImageButton) findViewById(R.id.baca);
        t_baca.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent doabukaActivityIntent = new Intent (SunnahActivity.this, doabukaActivity.class);
                startActivity (doabukaActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent RukunActivityIntent = new Intent (SunnahActivity.this, RukunActivity.class);
                startActivity (RukunActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent RusakActivityIntent = new Intent (SunnahActivity.this, RusakActivity.class);
                startActivity (RusakActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(SunnahActivity.this,R.raw.backsound);
        backsound.start();

    }
}
