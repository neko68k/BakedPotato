package com.neko68k.bakedpotato;

import android.os.Parcel;
import android.os.Parcelable;

public class VMS_Flashrom implements Parcelable{
	
	private VMS_File[] userData = new VMS_File[200];

	public VMS_Flashrom(Parcel in) {
		// TODO Auto-generated constructor stub
	}
	
	static final Parcelable.Creator<VMS_Flashrom> CREATOR
	    = new Parcelable.Creator<VMS_Flashrom>() {
	
	    public VMS_Flashrom createFromParcel(Parcel in) {
		    return new VMS_Flashrom(in);
		}
		
	    public VMS_Flashrom[] newArray(int size) {
		    return new VMS_Flashrom[size];
		}
	};

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
		// TODO Auto-generated method stub
		// parcelizing happens in here like below
		// arg0.writeInt(blah)
		
	}
	
	private class VMS_Root{
		private Byte[] validator = new Byte[16];	// should all be 0x55
		private Byte vmsColorFlag;					// 1 = use custom, 0 = standard white
		private Byte vmsColorBlue;
		private Byte vmsColorGreen;
		private Byte vmsColorRed;
		private Byte vmsColorAlhpa;
		private Byte[] unused = new Byte[0x1B];
		private Byte[] BCDTimeStamp = new Byte[8];
		private Byte[] unused2 = new Byte[8];
		private Byte[] unknown = new Byte[6];
		private Short ofsFAT;						// block 254
		private Short fatSize;						// size of FAT in blocks
		private Short ofsDirectory;					// block 253
		private Short directorySize;				// 13 blocks
		private Short iconShape;					// 0-123, these are shown in the bios
		private Short numUserBlocks;				// 200
	};

	private class VMS_Directory{
		private Byte fileType;						// 0 = no file, 0x33 = data, 0xCC = game
		private Byte copyProtect; 					// 0x00 = copy ok, 0xFF = copy protected
		private Short ofsFirstBlock;				
		private String filename;
		private Byte[] BCDTimeStamp = new Byte[8];
		private Short fileSize;						// in blocks
		private Short ofsHeader;					// in blocks
		private Byte[] unused = new Byte[3];
	};
}
