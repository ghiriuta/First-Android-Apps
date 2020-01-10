package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SyaratActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton next;
    ImageButton prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (SyaratActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent PerintahActivityIntent = new Intent (SyaratActivity.this, PerintahActivity.class);
                startActivity (PerintahActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent SyaratsActivityIntent = new Intent (SyaratActivity.this, SyaratsActivity.class);
                startActivity (SyaratsActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(SyaratActivity.this,R.raw.backsound);
        backsound.start();

    }
}
