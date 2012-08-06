package com.example.geokontakte;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Kontakte_anlegen extends Activity {
	public KontaktSpeicher kontaktSpeicher;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakte_anlegen);
        kontaktSpeicher=(KontaktSpeicher)getApplication();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_kontakte_anlegen, menu);
        return true;
    }
    public void kontaktAnlegen(View view){
    	String name,vorname,nummer;
    	name=((EditText)findViewById(R.id.name_text)).getText().toString();
    	vorname=((EditText)findViewById(R.id.vorname_text)).getText().toString();
    	nummer=((EditText)findViewById(R.id.handy_text)).getText().toString();
    	Kontakt kontakt=new Kontakt(name, vorname, nummer);
    	kontaktSpeicher.kontakte.add(kontakt);
    	// bei leeren EditText noch bearbeiten
    }
    public void felderLeeren(View view){
    	EditText name=((EditText)findViewById(R.id.name_text));
    	EditText vorname=((EditText)findViewById(R.id.vorname_text));
    	EditText nummer=((EditText)findViewById(R.id.handy_text));
    	name.setText("");
    	vorname.setText("");
    	nummer.setText("");
    }
}
