package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Salah_limaActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton prev;
    VideoView salah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salah_lima);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (Salah_limaActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent Test_limaActivityIntent = new Intent (Salah_limaActivity.this, Test_limaActivity.class);
                startActivity (Test_limaActivityIntent);
            }

        });

        //displaying video file
        salah = (VideoView) findViewById(R.id.salah);
        String uriPath2 = "android.resource://agatepie.belajarpuasaramadhan/" + R.raw.salah;
        Uri uri2 = Uri.parse(uriPath2);
        salah.setVideoURI(uri2);
        salah.requestFocus();
        salah.start();
    }
}
