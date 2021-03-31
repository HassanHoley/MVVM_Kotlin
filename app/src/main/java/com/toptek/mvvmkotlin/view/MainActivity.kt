package com.toptek.mvvmkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.toptek.mvvmkotlin.R
import com.toptek.mvvmkotlin.di_modules.DaggerApplicationComponent
import com.toptek.mvvmkotlin.modle.ContactList
import com.toptek.mvvmkotlin.modle.DataResponse
import com.toptek.mvvmkotlin.repository.RetrofitContactRepository
import com.toptek.mvvmkotlin.viewmodle.AppViewModelFactory
import com.toptek.mvvmkotlin.viewmodle.ContactActivityViewModel
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    public lateinit var vm: ContactActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //  var repository = RetrofitContactRepository()

        DaggerApplicationComponent.create().inject(this)



        vm.dataResponse.observe(this,{

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