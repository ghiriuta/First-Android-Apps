package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Benar_tigaActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton next;
    VideoView betul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benar_tiga);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (Benar_tigaActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Test_tigaActivityIntent = new Intent (Benar_tigaActivity.this, Test_empatActivity.class);
                startActivity (Test_tigaActivityIntent);
            }

        });

        //displaying video file
        betul = (VideoView) findViewById(R.id.betul);
        String uriPath2 = "android.resource://agatepie.belajarpuasaramadhan/" + R.raw.betul;
        Uri uri2 = Uri.parse(uriPath2);
        betul.setVideoURI(uri2);
        betul.requestFocus();
        betul.start();
    }
}
