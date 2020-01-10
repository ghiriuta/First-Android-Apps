package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai = (ImageButton) findViewById(R.id.play);
        mulai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MulaiActivityIntent = new Intent (MainActivity.this, MenuActivity.class);
                        startActivity (MulaiActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(MainActivity.this,R.raw.backsound);
        backsound.start();
    }

}
