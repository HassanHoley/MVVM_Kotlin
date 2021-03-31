package com.toptek.mvvmkotlin.viewmodle

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class AppViewModelFactory (var context: Context) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass == ContactActivityViewModel::class.java){
            //return ContactsActivityViewModel(context) as T
            return super.create(modelClass) as T
        }else{
            return super.create(modelClass)

        }


    }





}