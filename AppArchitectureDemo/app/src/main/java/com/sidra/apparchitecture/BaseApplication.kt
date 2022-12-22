package com.sidra.apparchitecture

import android.app.Application
import com.sidra.core.Local.IPostsLocalDataSorce
import com.sidra.core.Network.IPostsNetworkDataSource
import com.sidra.core.Services.IPostService
import com.sidra.network_data_source.NetworkDataImpl
import com.sidra.service.PostsService
import dagger.hilt.android.HiltAndroidApp
import org.koin.dsl.module

@HiltAndroidApp
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

//    val diModule = module {
////        factory<IPostsLocalDataSorce> { }
//        factory<IPostService> { PostsService(get(), get()) }
//        factory<IPostsNetworkDataSource> { NetworkDataImpl() }
////        factory { AuthViewModel(get()) }
//    }
}