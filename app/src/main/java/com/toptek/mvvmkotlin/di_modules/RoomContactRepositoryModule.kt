package com.toptek.mvvmkotlin.di_modules

import com.toptek.mvvmkotlin.repository.ContactRepository
import com.toptek.mvvmkotlin.repository.RoomContactRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton


@Module
interface RoomContactRepositoryModule {
    @Singleton
    @Binds
    public fun provideRepository(roomContactRepository: RoomContactRepository):ContactRepository
}