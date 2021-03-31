package com.toptek.mvvmkotlin.di_modules

import com.toptek.mvvmkotlin.repository.ContactRepository
import com.toptek.mvvmkotlin.repository.RetrofitContactRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton


@Module
interface RetrofitContactRepositoryModule {
    @Singleton
    @Binds
    public fun provideRepository(retrofitContactRepository : RetrofitContactRepository) :ContactRepository
}