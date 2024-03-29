package dz.salim.android.travelmantics

import android.os.Parcel
import android.os.Parcelable

class Traveldeal (): Parcelable{
    var id: String? = null
    var title: String? = null
    var price: String? = null
    var description: String? = null
    var imageUrl: String? = null
    var imageName: String ? = null

    constructor(parcel: Parcel) : this() {
        id = parcel.readString()
        title = parcel.readString()
        price = parcel.readString()
        description = parcel.readString()
        imageUrl = parcel.readString()
        imageName = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(title)
        parcel.writeString(price)
        parcel.writeString(description)
        parcel.writeString(imageUrl)
        parcel.writeString(imageName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Traveldeal> {
        override fun createFromParcel(parcel: Parcel): Traveldeal {
            return Traveldeal(parcel)
        }

        override fun newArray(size: Int): Array<Traveldeal?> {
            return arrayOfNulls(size)
        }
    }
}