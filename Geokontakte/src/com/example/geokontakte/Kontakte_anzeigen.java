package com.example.geokontakte;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Kontakte_anzeigen extends Activity {
	public KontaktSpeicher kontaktSpeicher;
	public ListView listView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		kontaktSpeicher = KontaktSpeicher.getInstance();
		setContentView(R.layout.activity_kontakte_anzeigen);
		listView = (ListView) findViewById(R.id.kontake_list);
		listeFuellen();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_kontakte_anzeigen, menu);
		return true;
	}

	public void listeFuellen() {
		String[] liste = new String[kontaktSpeicher.kontakte.size()];
		for (int i = 0; i < kontaktSpeicher.kontakte.size(); i++) {
			liste[i] = kontaktSpeicher.kontakte.get(i).toString();
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, liste);
		listView.setAdapter(adapter);
	}
}
