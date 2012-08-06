package com.example.geokontakte;

import java.io.Serializable;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.app.Activity;
import android.view.Menu;

public class Kontakt implements Serializable, Parcelable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 123456789L;
	public String name;
	public String vorname;
	public String nummer;

	public Kontakt(String name, String vorname, String nummer) {
		this.name = name;
		this.vorname = vorname;
		this.nummer = nummer;
	}

	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		return name + " " + vorname + "\n" + nummer;
	}
}
