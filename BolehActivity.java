package agatepie.belajarpuasaramadhan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BolehActivity extends AppCompatActivity {

    ImageButton t_home;
    ImageButton next;
    ImageButton prev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boleh);

        t_home = (ImageButton) findViewById(R.id.home);
        t_home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent MenuActivityIntent = new Intent (BolehActivity.this, MenuActivity.class);
                startActivity (MenuActivityIntent);
            }

        });

        prev = (ImageButton) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent SyaratsActivityIntent = new Intent (BolehActivity.this, SyaratsActivity.class);
                startActivity (SyaratsActivityIntent);
            }

        });

        next = (ImageButton) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                Intent RukunActivityIntent = new Intent (BolehActivity.this, RukunActivity.class);
                startActivity (RukunActivityIntent);
            }

        });

        MediaPlayer backsound = MediaPlayer.create(BolehActivity.this,R.raw.backsound);
        backsound.start();

    }
}
