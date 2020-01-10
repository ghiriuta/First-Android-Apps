package agatepie.belajarpuasaramadhan;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RukunActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton t_baca;
    ImageButton next;
    ImageButton prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (RukunActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        t_baca = (ImageButton) findViewById(R.id.baca);
        t_baca.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent batalActivityIntent = new Intent (RukunActivity.this, batalActivity.class);
                startActivity (batalActivityIntent);

                MediaPlayer backsound = MediaPlayer.create(RukunActivity.this,R.raw.backsound);
                backsound.stop();
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent BolehActivityIntent = new Intent (RukunActivity.this, BolehActivity.class);
                startActivity (BolehActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent SunnahActivityIntent = new Intent (RukunActivity.this, SunnahActivity.class);
                startActivity (SunnahActivityIntent);
            }

        });

    }
}
