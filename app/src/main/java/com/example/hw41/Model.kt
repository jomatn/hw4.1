package com.example.hw41

import android.os.Parcel
import android.os.Parcelable

data class Model (val name: String = "",
             val email: String = "",
             val phone: String = ""):Parcelable{

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.apply {
            writeString(name)
            writeString(email)
            writeString(phone)
        }
    }

    companion object CREATOR : Parcelable.Creator<Model> {
        override fun createFromParcel(parcel: Parcel): Model {
            return Model()
        }

        override fun newArray(size: Int): Array<Model?> {
            return arrayOfNulls(size)
        }
    }

}