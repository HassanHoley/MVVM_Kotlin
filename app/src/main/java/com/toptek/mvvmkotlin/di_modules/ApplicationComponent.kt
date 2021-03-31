package com.toptek.mvvmkotlin.di_modules

import com.toptek.mvvmkotlin.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [RetrofitContactRepositoryModule::class])
interface ApplicationComponent {

    public fun inject (mainActivity: MainActivity)
}