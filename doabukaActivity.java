package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class doabukaActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton next;
    ImageButton prev;
    VideoView buka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doabuka);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (doabukaActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent RukunActivityIntent = new Intent (doabukaActivity.this, RukunActivity.class);
                startActivity (RukunActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent RusakActivityIntent = new Intent (doabukaActivity.this, RusakActivity.class);
                startActivity (RusakActivityIntent);
            }

        });

        //displaying video file
        buka = (VideoView) findViewById(R.id.buka);
        String uriPath2 = "android.resource://agatepie.belajarpuasaramadhan/" + R.raw.buka;
        Uri uri2 = Uri.parse(uriPath2);
        buka.setVideoURI(uri2);
        buka.requestFocus();
        buka.start();
    }
}
