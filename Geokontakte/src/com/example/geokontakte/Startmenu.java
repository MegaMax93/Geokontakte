package com.example.geokontakte;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Startmenu extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startmenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_startmenu, menu);
        return true;
    }
    public void kontakteAnzeigen(View view){
    	Intent intent=new Intent(this,Kontakte_anzeigen.class );
    	startActivity(intent);
    }
    public void kontakteAnlegen(View view){
    	Intent intent =new Intent(this,Kontakte_anlegen.class);
    	startActivity(intent);
    }
}
