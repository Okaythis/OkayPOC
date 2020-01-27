package com.okaythis.okaypoc.data.datasources.remote

import com.okaythis.okaypoc.data.datasources.BankTransactionDataSource
import com.okaythis.okaypoc.data.models.okay.Status
import com.okaythis.okaypoc.data.models.transactions.CheckBalanceResponse
import com.okaythis.okaypoc.data.models.transactions.PaymentResponse
import com.okaythis.okaypoc.data.models.user.Recipient
import com.okaythis.okaypoc.network.Network
import io.reactivex.Observable

class RemoteBankTransactionDataSource(remoteApi: Network): BankTransactionDataSource {

    private val transactionsApi = remoteApi.getTransactionsApi()

    override fun makePayment(amount: Double, accountNumber: Int): Observable<PaymentResponse> {
        return transactionsApi.makePayment(amount, accountNumber)
    }

    override fun checkBalance(userId: Int, accountNumber: Int): Observable<CheckBalanceResponse> {
        return transactionsApi.checkBalance()
    }

    override fun addRecipient(recipient: Recipient): Observable<Status> {
        return transactionsApi.addRecipient(recipient)
    }

    override fun linkUser(appExternalId: String?, userId: Int): Observable<Status> {
        return transactionsApi.linkUser(appExternalId!!, userId)
    }

    override fun verifyUserLogin(externalId: String): Observable<Status> {
       return transactionsApi.verifyUserLogin(externalId)
    }
}