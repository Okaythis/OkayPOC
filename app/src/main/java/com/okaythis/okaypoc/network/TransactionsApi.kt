package com.okaythis.okaypoc.network

import com.okaythis.okaypoc.data.models.okay.AuthorizationResponse
import com.okaythis.okaypoc.data.models.okay.LinkUserReponse
import com.okaythis.okaypoc.data.models.okay.Status
import com.okaythis.okaypoc.data.models.transactions.CheckBalanceResponse
import com.okaythis.okaypoc.data.models.transactions.PaymentResponse
import com.okaythis.okaypoc.data.models.user.Recipient
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query


interface TransactionsApi {

    @POST("/link")
    fun linkUser(@Query("userExternalId") userExternalId: String?): Call<LinkUserReponse>

    @POST("/auth")
    fun authorizeTransaction(@Query("userExternalId") userExternalId: String?): Call<AuthorizationResponse>

    @POST("/auth/pin")
    fun authorizeOTPTransaction(@Query("userExternalId") userExternalId: String?): Call<AuthorizationResponse>


    @POST()
    fun makePayment(amount: Double, accountNumber: Int): Observable<PaymentResponse>
    @POST()
    fun checkBalance(): Observable<CheckBalanceResponse>
    @POST()
    fun addRecipient(recipient: Recipient): Observable<Status>
    @POST()
    fun linkUser(appExternalId: String, userId: Int): Observable<Status>
    @POST()
    fun verifyUserLogin(externalId: String): Observable<Status>
}