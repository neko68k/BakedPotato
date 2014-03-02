package com.neko68k.bakedpotato;

import android.os.Parcel;
import android.os.Parcelable;

public class VMS_File implements Parcelable{
	private String fileDescVMUMenu;
	private String fileDescBIOSMenu;
	private String creatorID;
	private Short numIcons;			// >1 for animated icons
	private Short iconAnimSpeed;
	private Short eyecatchType;		// 0 = none
	private Short CRC;
	private Long fileSize;			// number of bytes after header
	private Byte[] RESERVED = new Byte[20];
	private Short[] iconPal = new Short[16];
	private Byte[] icons;
	private Byte[] eyecatch;		// size varies
	private Byte[] data;

	public VMS_File() {
		// TODO Auto-generated constructor stub
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

}
