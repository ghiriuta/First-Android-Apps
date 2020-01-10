package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class batalActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton next;
    ImageButton prev;
    VideoView niat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batal);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (batalActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent BolehActivityIntent = new Intent (batalActivity.this, BolehActivity.class);
                startActivity (BolehActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent SunnahActivityIntent = new Intent (batalActivity.this, SunnahActivity.class);
                startActivity (SunnahActivityIntent);
            }

        });


        //displaying video file
        niat = (VideoView) findViewById(R.id.niat);
        String uriPath2 = "android.resource://agatepie.belajarpuasaramadhan/" + R.raw.niat;
        Uri uri2 = Uri.parse(uriPath2);
        niat.setVideoURI(uri2);
        niat.requestFocus();
        niat.start();

    }
}
