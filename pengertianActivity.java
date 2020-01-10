package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pengertianActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent MenuActivityIntent = new Intent(pengertianActivity.this, MenuActivity.class);
                startActivity(MenuActivityIntent);

            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent PerintahActivityIntent = new Intent(pengertianActivity.this, PerintahActivity.class);
                startActivity(PerintahActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(pengertianActivity.this, R.raw.backsound);
        backsound.start();

    }

}
