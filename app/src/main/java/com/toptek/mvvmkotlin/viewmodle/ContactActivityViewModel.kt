package com.toptek.mvvmkotlin.viewmodle

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.toptek.mvvmkotlin.modle.ContactList
import com.toptek.mvvmkotlin.modle.DataResponse
import com.toptek.mvvmkotlin.repository.RetrofitContactRepository

class ContactActivityViewModel (context: Context) : ViewModel() {
   public var dataResponse : LiveData<DataResponse<ContactList>>
   private var retrofitContactRepository : RetrofitContactRepository


    init {
        retrofitContactRepository = RetrofitContactRepository()
        dataResponse = retrofitContactRepository.getContactsList()

    }

}