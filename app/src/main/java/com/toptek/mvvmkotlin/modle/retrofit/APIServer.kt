package com.toptek.mvvmkotlin.modle.retrofit

import com.toptek.mvvmkotlin.modle.ContactList
import retrofit2.Call
import retrofit2.http.GET

interface APIServer  {
    @GET("contacts/")
    public fun getContactList() :Call<ContactList>
}