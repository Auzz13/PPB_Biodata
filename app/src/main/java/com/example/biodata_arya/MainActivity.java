package com.example.biodata_arya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/7%C2%B027'06.2%22S+109%C2%B015'22.6%22E/@-7.4517187,109.2557288,19z/data=!3m1!4b1!4m6!3m5!1s0x0:0x906610b7a8136e4a!7e2!8m2!3d-7.4517197!4d109.2562759"));
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:aryabagus2003@gmail.com"));
        startActivity(intent);
    }
    public void telepon(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081215950105"));
        startActivity(intent);
    }
}