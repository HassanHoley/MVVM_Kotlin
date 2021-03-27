package com.toptek.mvvmkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.toptek.mvvmkotlin.R
import com.toptek.mvvmkotlin.modle.ContactList
import com.toptek.mvvmkotlin.modle.DataResponse
import com.toptek.mvvmkotlin.repository.RetrofitContactRepository


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var repository = RetrofitContactRepository()
        repository.getContactsList().observe(this,{

            if (it.result == DataResponse.Result.SUCCESS){
                var contactList = it.data
                if (contactList != null){
                   for (c in contactList.contacts){
                       Log.d("ttt",c.name)

                   }


                }

            }else if (it.result == DataResponse.Result.FAILURE) {

                Log.d("ttt",it.errorMassage.toString())
            }
        })
    }
}