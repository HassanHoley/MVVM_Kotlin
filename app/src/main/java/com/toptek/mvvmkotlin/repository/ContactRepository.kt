package com.toptek.mvvmkotlin.repository

import androidx.lifecycle.LiveData
import com.toptek.mvvmkotlin.modle.ContactList
import com.toptek.mvvmkotlin.modle.DataResponse

interface ContactRepository {

    public fun getContactsList():LiveData<DataResponse<ContactList>>
}