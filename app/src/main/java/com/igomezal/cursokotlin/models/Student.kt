package com.igomezal.cursokotlin.models

import android.os.Parcel
import android.os.Parcelable

// Parcel is a message container.
// It can be used to send a Serializable Object through Intents.
// Better performance than Serializer.
data class Student(var name: String, var lastName: String, var age: Int, var isDeveloper: Boolean = true): Parcelable {
    constructor(parcel: Parcel): this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readByte() != 0.toByte())

    override fun writeToParcel(dest: Parcel, flags: Int) {
        // We have to write the values in the same order as in the constructor
        dest.writeString(name)
        dest.writeString(lastName)
        dest.writeInt(age)
        dest.writeByte(if(isDeveloper) 1 else 0)
    }

    // Describe content type of Object Parcelable
    // 0 always used, the other value is 1 or CONTENTS_FILE_DESCRIPTOR for object types that implements a File Descriptor
    override fun describeContents() = 0

    companion object CREATOR: Parcelable.Creator<Student> {
        // This one create the object form parcel calling to the secondary constructor
        override fun createFromParcel(source: Parcel) = Student(source)

        // This will help to serialize objects of the same type of this class (Student)
        override fun newArray(size: Int) = arrayOfNulls<Student?>(size)
    }
}
