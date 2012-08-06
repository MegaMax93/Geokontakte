package com.example.geokontakte;

import java.io.Serializable;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ListView;

public class Kontakt implements Serializable,Parcelable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 123456789L;
	public String name;
	public String vorname;
	public String nummer;
	public Kontakt(String name, String vorname, String nummer){
		this.name=name;
		this.vorname=vorname;
		this.nummer=nummer;
	}
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		
	}
	public String toString(){
		return name+" "+vorname+"\n"+nummer;
	}
}
