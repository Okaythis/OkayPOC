package com.okaythis.okaypoc.data.repository.interfaces

import com.okaythis.okaypoc.data.models.okay.Status
import com.okaythis.okaypoc.data.models.transactions.CheckBalanceResponse
import com.okaythis.okaypoc.data.models.transactions.PaymentResponse
import com.okaythis.okaypoc.data.models.user.Recipient
import io.reactivex.Observable

interface BankTransactionsRepository {
    fun makePayment(amount: Double, accountNumber: Int): Observable<PaymentResponse>
    fun checkBalance(userId: Int, accountNumber: Int): Observable<CheckBalanceResponse>
    fun addRecipient(recipient: Recipient): Observable<Status>
    fun linkUser(appExternalId: String?, userId: Int): Observable<Status>
    fun verifyUserLogin(externalId: String): Observable<Status>
}