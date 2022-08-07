package com.example.adicodingsub;

import android.os.Parcel;
import android.os.Parcelable;

public class DMNS implements Parcelable{
    private String name;
    private String detail;
    private String more_exp;
    private String more_exp_sec;
    private int Photo_sec;
    private int Photo_one;
    private String favoritename;

    public DMNS() {

    }

    public String getMore_exp() {
        return more_exp;
    }

    public void setMore_exp(String more_exp) {
        this.more_exp = more_exp;
    }

    public String getMore_exp_sec() {
        return more_exp_sec;
    }

    public void setMore_exp_sec(String more_exp_sec) {
        this.more_exp_sec = more_exp_sec;
    }

    public int getPhoto_sec() {
        return Photo_sec;
    }

    public void setPhoto_sec(int photo_sec) {
        Photo_sec = photo_sec;
    }

    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getPhoto_one() {
        return Photo_one;
    }

    public void setPhoto_one(int photo_one) {
        Photo_one = photo_one;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeString(more_exp);
        parcel.writeInt(photo);
        parcel.writeInt(Photo_one);
        parcel.writeInt(Photo_sec);
    }

    protected DMNS(Parcel in) {
        name = in.readString();
        detail = in.readString();
        more_exp = in.readString();
        photo = in.readInt();
        Photo_one = in.readInt();
        Photo_sec = in.readInt();
    }

    public static final Parcelable.Creator<DMNS> CREATOR = new Parcelable.Creator<DMNS>() {
        @Override
        public DMNS createFromParcel(Parcel in) {
            return new DMNS(in);
        }

        @Override
        public DMNS[] newArray(int size) {
            return new DMNS[size];
        }
    };

    public String getFavoritename() {
        return favoritename;
    }

    public void setFavoritename(String favoritename) {
        this.favoritename = favoritename;
    }
}
