package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Test_tigaActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton orang_sehat;
    ImageButton orang_sakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_tiga);
        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (Test_tigaActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        orang_sakit = (ImageButton) findViewById(R.id.orang_sakit);
        orang_sakit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Benar_tigaActivityIntent = new Intent (Test_tigaActivity.this, Benar_tigaActivity.class);
                startActivity (Benar_tigaActivityIntent);
            }

        });

        orang_sehat = (ImageButton) findViewById(R.id.orang_sehat);
        orang_sehat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Salah_tigaActivityIntent = new Intent (Test_tigaActivity.this, Salah_tigaActivity.class);
                startActivity (Salah_tigaActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(Test_tigaActivity.this,R.raw.backsound);
        backsound.start();

    }
}
