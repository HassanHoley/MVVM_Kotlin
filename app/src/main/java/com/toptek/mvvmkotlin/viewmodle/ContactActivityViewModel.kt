package com.toptek.mvvmkotlin.viewmodle

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.toptek.mvvmkotlin.modle.ContactList
import com.toptek.mvvmkotlin.modle.DataResponse
import com.toptek.mvvmkotlin.repository.RetrofitContactRepository
import javax.inject.Inject

class ContactActivityViewModel @Inject constructor (contactRepository: RetrofitContactRepository) : ViewModel() {

     public  var dataResponse : LiveData<DataResponse<ContactList>>

    init {
        Log.d("ttt","Initialize view model.....")
        dataResponse = contactRepository.getContactsList()
    }

}