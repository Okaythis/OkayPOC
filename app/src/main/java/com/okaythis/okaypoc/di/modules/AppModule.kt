package com.okaythis.okaypoc.di.modules


import com.okaythis.okaypoc.data.datasources.BankTransactionDataSource
import com.okaythis.okaypoc.data.datasources.remote.RemoteBankTransactionDataSource
import com.okaythis.okaypoc.data.repository.BankTransactionsRepositoryImpl
import com.okaythis.okaypoc.data.repository.interfaces.BankTransactionsRepository
import com.okaythis.okaypoc.data.repository.interfaces.prettythings.ProductsRepository
import com.okaythis.okaypoc.data.repository.prettythings.ProductsRepositoryImpl
import com.okaythis.okaypoc.network.Network
import com.okaythis.okaypoc.network.retrofit.RetrofitWrapper
import com.okaythis.okaypoc.usecases.prettythings.list.adapters.ProductListAdapter
import com.okaythis.okaypoc.usecases.prettythings.ui.home.HomeContract
import com.okaythis.okaypoc.usecases.prettythings.ui.home.HomePresenter
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
    single<ProductsRepository> {
        ProductsRepositoryImpl()
    }
    single<HomeContract.Actions> {
        HomePresenter(get())
    }

    single {
        ProductListAdapter(ArrayList(0))
    }
}