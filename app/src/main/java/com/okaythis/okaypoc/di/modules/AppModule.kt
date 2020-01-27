package com.okaythis.okaypoc.di.modules


import com.okaythis.okaypoc.data.datasources.BankTransactionDataSource
import com.okaythis.okaypoc.data.datasources.remote.RemoteBankTransactionDataSource
import com.okaythis.okaypoc.data.repository.BankTransactionsRepositoryImpl
import com.okaythis.okaypoc.data.repository.interfaces.BankTransactionsRepository
import com.okaythis.okaypoc.network.Network
import com.okaythis.okaypoc.network.retrofit.RetrofitWrapper
import org.koin.dsl.module

val appModule = module {

    single<Network> {
        RetrofitWrapper()
    }
    single<BankTransactionDataSource> {
        RemoteBankTransactionDataSource(get())
    }
    single<BankTransactionsRepository> {
            BankTransactionsRepositoryImpl(get())
    }
}