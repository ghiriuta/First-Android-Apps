package agatepie.belajarpuasaramadhan;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    ImageButton coba;
    ImageButton t_satu;
    ImageButton t_dua;
    ImageButton t_tiga;
    ImageButton t_empat;
    ImageButton t_lima;
    ImageButton t_enam;
    ImageButton test;
    ImageButton btAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        coba = (ImageButton) findViewById(R.id.coba);
        coba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BatalActivityIntent = new Intent(MenuActivity.this, batalActivity.class);
                startActivity(BatalActivityIntent);
            }
        });

        t_satu = (ImageButton) findViewById(R.id.t_satu);
        t_satu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent PengertianActivityIntent = new Intent(MenuActivity.this, pengertianActivity.class);
                startActivity(PengertianActivityIntent);
            }

        });

        t_dua = (ImageButton) findViewById(R.id.t_dua);
        t_dua.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent SyaratActivityIntent = new Intent(MenuActivity.this, SyaratActivity.class);
                startActivity(SyaratActivityIntent);
            }

        });

        t_tiga = (ImageButton) findViewById(R.id.t_tiga);
        t_tiga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent RukunActivityIntent = new Intent(MenuActivity.this, RukunActivity.class);
                startActivity(RukunActivityIntent);
            }

        });

        t_empat = (ImageButton) findViewById(R.id.t_empat);
        t_empat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent SunnahActivityIntent = new Intent(MenuActivity.this, SunnahActivity.class);
                startActivity(SunnahActivityIntent);
            }

        });

        t_lima = (ImageButton) findViewById(R.id.t_lima);
        t_lima.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent RusakActivityIntent = new Intent(MenuActivity.this, RusakActivity.class);
                startActivity(RusakActivityIntent);
            }

        });

        t_enam = (ImageButton) findViewById(R.id.t_enam);
        t_enam.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent HikmahActivityIntent = new Intent(MenuActivity.this, HikmahActivity.class);
                startActivity(HikmahActivityIntent);
            }

        });

        test = (ImageButton) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent TestActivityIntent = new Intent(MenuActivity.this, TestActivity.class);
                startActivity(TestActivityIntent);
            }

        });

        btAlert = (ImageButton) findViewById(R.id.bt_alert);
        btAlert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        MediaPlayer backsound = MediaPlayer.create(MenuActivity.this,R.raw.backsound);
        backsound.start();
    }


    private void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Keluar dari aplikasi?");

        // set pesan dar i dialog
        alertDialogBuilder
                .setMessage("Klik Ya untuk keluar!")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        //finish();
                        //System.exit(0);
                        AppExit();
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();

    }

    public void AppExit()
    {

        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    /*int pid = android.os.Process.myPid();=====> use this if you want to kill your activity. But its not a good one to do.
    android.os.Process.killProcess(pid);*/

    }
}


