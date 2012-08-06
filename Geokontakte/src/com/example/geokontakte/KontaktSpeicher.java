package com.example.geokontakte;

import java.util.ArrayList;

import android.app.Application;

public class KontaktSpeicher extends Application{
	public ArrayList<Kontakt>kontakte;
	private static KontaktSpeicher speicher;
	public void anlegen(Kontakt kontakt){
		kontakte.add(kontakt);
	}
	public void loeschen(Kontakt kontakt){
		kontakte.remove(kontakt);
	}
	public void speichern(){
		
	}
	public void laden(){
		
	}
	public void onCreate(){
		super.onCreate();
		kontakte=new ArrayList<Kontakt>();
		speicher=this;
	}
	public static KontaktSpeicher getInstance(){
		return speicher;
	}
}
