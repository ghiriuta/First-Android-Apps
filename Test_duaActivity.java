package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Test_duaActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton islam;
    ImageButton agama_lain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dua);
        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (Test_duaActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        islam = (ImageButton) findViewById(R.id.islam);
        islam.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Benar_duaActivityIntent = new Intent (Test_duaActivity.this, Benar_duaActivity.class);
                startActivity (Benar_duaActivityIntent);
            }

        });

        agama_lain = (ImageButton) findViewById(R.id.agama_lain);
        agama_lain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Salah_duaActivityIntent = new Intent (Test_duaActivity.this, Salah_duaActivity.class);
                startActivity (Salah_duaActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(Test_duaActivity.this,R.raw.backsound);
        backsound.start();
    }
}
