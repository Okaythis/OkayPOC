package com.okaythis.okaypoc.usecases.prettythings.ui.home

import com.okaythis.okaypoc.data.models.prettythings.Product

interface HomeContract {

    interface  View {
        fun openProductDetails()
    }

    interface Actions {
        fun loadProducts(): ArrayList<Product>
    }
}