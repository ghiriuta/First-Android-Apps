package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class videorusakActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton next;
    ImageButton prev;
    VideoView rusak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videorusak);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent MenuActivityIntent = new Intent(videorusakActivity.this, MenuActivity.class);
                startActivity(MenuActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent SunnahActivityIntent = new Intent(videorusakActivity.this, SunnahActivity.class);
                startActivity(SunnahActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent HikmahActivityIntent = new Intent(videorusakActivity.this, HikmahActivity.class);
                startActivity(HikmahActivityIntent);
            }

        });

        rusak = (VideoView) findViewById(R.id.rusak);
        rusak.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+ R.raw.rusaknya_puasa));
        rusak.setMediaController(new MediaController(this));
        rusak.start();

    }
}





