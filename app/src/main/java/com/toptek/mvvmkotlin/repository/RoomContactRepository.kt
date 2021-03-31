package com.toptek.mvvmkotlin.repository

import androidx.lifecycle.LiveData
import com.toptek.mvvmkotlin.modle.ContactList
import com.toptek.mvvmkotlin.modle.DataResponse

class RoomContactRepository :ContactRepository {
    override fun getContactsList(): LiveData<DataResponse<ContactList>> {
        TODO("Not yet implemented")
    }
}