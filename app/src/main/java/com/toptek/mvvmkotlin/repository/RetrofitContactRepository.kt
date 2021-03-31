package com.toptek.mvvmkotlin.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.toptek.mvvmkotlin.modle.ContactList
import com.toptek.mvvmkotlin.modle.DataResponse
import com.toptek.mvvmkotlin.modle.retrofit.RetrofitUtility
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class RetrofitContactRepository @Inject constructor(var retrofitUtility:  RetrofitUtility) :ContactRepository {


    override fun getContactsList(): LiveData<DataResponse<ContactList>> {
     var mtd = MutableLiveData<DataResponse<ContactList>>()
     var dataResponse =DataResponse<ContactList>()
        retrofitUtility.client.getContactList().enqueue(object :Callback<ContactList>{
            override fun onResponse(call: Call<ContactList>, response: Response<ContactList>) {
                dataResponse.data = response.body()
                dataResponse.result = DataResponse.Result.SUCCESS
                mtd.postValue(dataResponse)
            }

            override fun onFailure(call: Call<ContactList>, t: Throwable?) {
                dataResponse.result = DataResponse.Result.FAILURE
                dataResponse.errorMassage = t?.localizedMessage
                mtd.postValue(dataResponse)
            }
        })

      return mtd

    }
}