package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Benar_limaActivity extends AppCompatActivity {

    ImageButton t_home;
    VideoView betul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benar_lima);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (Benar_limaActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
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
