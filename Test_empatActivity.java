package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Test_empatActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton buka_manis;
    ImageButton tidur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_empat);
        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (Test_empatActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        buka_manis = (ImageButton) findViewById(R.id.buka_manis);
        buka_manis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Benar_empatActivityIntent = new Intent (Test_empatActivity.this, Benar_empatActivity.class);
                startActivity (Benar_empatActivityIntent);
            }

        });

        tidur= (ImageButton) findViewById(R.id.tidur);
        tidur.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Salah_empatActivityIntent = new Intent (Test_empatActivity.this, Salah_empatActivity.class);
                startActivity (Salah_empatActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(Test_empatActivity.this,R.raw.backsound);
        backsound.start();
    }
}
