package com.example.cryptoapp.data.di

import com.example.cryptoapp.data.workers.ChildWorkerFactory
import com.example.cryptoapp.data.workers.RefeshDataWorker
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface WorkerModule {

    @IntoMap
    @WorkerKey(RefeshDataWorker::class)
    @Binds
    fun bindRefreshDataWorkerFactory(impl: RefeshDataWorker.Factory): ChildWorkerFactory
}