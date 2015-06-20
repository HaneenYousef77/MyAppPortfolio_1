package com.udacity.haneen.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.*;

public class nanodegree_apps extends ActionBarActivity {

    Button SpotifyStreamer;
    Button ScoresApp;
    Button LibraryApp;
    Button BuildItBigger;
    Button XYZReader;
    Button Capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nanodegree_apps);

        SpotifyStreamer = (Button) findViewById(R.id.spotify_streamer);
        ScoresApp       = (Button) findViewById(R.id.scores_app);
        LibraryApp      = (Button) findViewById(R.id.library_app);
        BuildItBigger   = (Button) findViewById(R.id.build_it_bigger);
        XYZReader       = (Button) findViewById(R.id.xyz_reader);
        Capstone        = (Button) findViewById(R.id.capstone);


        SpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toast_msg = "This button will lunch Soptify Streamer App";
                Context context = getApplicationContext();
                Toast.makeText(context, toast_msg, Toast.LENGTH_SHORT).show();
            }
        });
        ScoresApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toast_msg = "This button will lunch Scores App";
                Context context = getApplicationContext();
                Toast.makeText(context, toast_msg, Toast.LENGTH_SHORT).show();
            }
        });
        LibraryApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toast_msg = "This button will lunch Library App";
                Context context = getApplicationContext();
                Toast.makeText(context, toast_msg, Toast.LENGTH_SHORT).show();
            }
        });
        BuildItBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toast_msg = "This button will lunch Build it Bigger App";
                Context context = getApplicationContext();
                Toast.makeText(context, toast_msg, Toast.LENGTH_SHORT).show();
            }
        });
        XYZReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toast_msg = "This button will lunch XYZ Reader App";
                Context context = getApplicationContext();
                Toast.makeText(context, toast_msg, Toast.LENGTH_SHORT).show();
            }
        });
        Capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence toast_msg = "This button will lunch Capstone App";
                Context context = getApplicationContext();
                Toast.makeText(context, toast_msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
