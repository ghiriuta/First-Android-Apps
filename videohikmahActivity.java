package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class videohikmahActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton prev;
    VideoView makna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videohikmah);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (videohikmahActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(videohikmahActivity.this,R.raw.backsound);
        backsound.start();

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent RusakActivityIntent = new Intent (videohikmahActivity.this, RusakActivity.class);
                startActivity (RusakActivityIntent);
            }

        });

        makna= (VideoView) findViewById(R.id.makna);
        makna.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+ R.raw.makna));
        makna.setMediaController(new MediaController(this));
        makna.start();

    }
}