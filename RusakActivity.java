package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RusakActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton v_hikmah;
    ImageButton next;
    ImageButton prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rusak);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (RusakActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        v_hikmah = (ImageButton) findViewById(R.id.v_hikmah);
        v_hikmah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent VideorusakMenuActivityIntent = new Intent (RusakActivity.this, videorusakActivity.class);
                startActivity (VideorusakMenuActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent SunnahActivityIntent = new Intent (RusakActivity.this, SunnahActivity.class);
                startActivity (SunnahActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent HikmahActivityIntent = new Intent (RusakActivity.this, HikmahActivity.class);
                startActivity (HikmahActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(RusakActivity.this,R.raw.backsound);
        backsound.start();
    }
}
