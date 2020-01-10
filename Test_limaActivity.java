package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Test_limaActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton sabar;
    ImageButton marah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lima);
        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (Test_limaActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        sabar = (ImageButton) findViewById(R.id.sabar);
        sabar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Benar_limaActivityIntent = new Intent (Test_limaActivity.this, Benar_limaActivity.class);
                startActivity (Benar_limaActivityIntent);
            }

        });

        marah= (ImageButton) findViewById(R.id.marah);
        marah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Salah_limaActivityIntent = new Intent (Test_limaActivity.this, Salah_limaActivity.class);
                startActivity (Salah_limaActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(Test_limaActivity.this,R.raw.backsound);
        backsound.start();
    }
}
