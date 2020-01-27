package com.okaythis.okaypoc.data.repository

import com.okaythis.okaypoc.data.datasources.BankTransactionDataSource
import com.okaythis.okaypoc.data.models.okay.Status
import com.okaythis.okaypoc.data.models.transactions.CheckBalanceResponse
import com.okaythis.okaypoc.data.models.transactions.PaymentResponse
import com.okaythis.okaypoc.data.models.user.Recipient
import com.okaythis.okaypoc.data.repository.interfaces.BankTransactionsRepository
import io.reactivex.Observable


class BankTransactionsRepositoryImpl(private val remoteTransactionDataSource: BankTransactionDataSource): BankTransactionsRepository {

    override fun makePayment(amount: Double, accountNumber: Int): Observable<PaymentResponse> {
        return remoteTransactionDataSource.makePayment(amount, accountNumber)
    }

    override fun checkBalance(userId: Int, accountNumber: Int): Observable<CheckBalanceResponse> {
        return remoteTransactionDataSource.checkBalance(userId, accountNumber)
    }

    override fun addRecipient(recipient: Recipient): Observable<Status> {
       return remoteTransactionDataSource.addRecipient(recipient)
    }

    override fun linkUser(appExternalId: String?, userId: Int): Observable<Status> {
        return remoteTransactionDataSource.linkUser(appExternalId!!, userId)
    }

    override fun verifyUserLogin(externalId: String): Observable<Status> {
        return remoteTransactionDataSource.verifyUserLogin(externalId)
    }
}