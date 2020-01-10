package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HikmahActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton v_hikmah;
    ImageButton prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hikmah);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (HikmahActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });


        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent RusakActivityIntent = new Intent (HikmahActivity.this, RusakActivity.class);
                startActivity (RusakActivityIntent);
            }

        });

        v_hikmah = (ImageButton) findViewById(R.id.v_hikmah);
        v_hikmah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent VideohikmahMenuActivityIntent = new Intent (HikmahActivity.this, videohikmahActivity.class);
                startActivity (VideohikmahMenuActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(HikmahActivity.this,R.raw.backsound);
        backsound.start();
    }
}
