package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TestActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton allah;
    ImageButton ortu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (TestActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        allah = (ImageButton) findViewById(R.id.allah);
        allah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Benar_satuActivityIntent = new Intent (TestActivity.this, Benar_satuActivity.class);
                startActivity (Benar_satuActivityIntent);
            }

        });

        ortu = (ImageButton) findViewById(R.id.ortu);
        ortu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Salah_satuActivityIntent = new Intent (TestActivity.this, Salah_satuActivity.class);
                startActivity (Salah_satuActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(TestActivity.this,R.raw.backsound);
        backsound.start();
    }
}
