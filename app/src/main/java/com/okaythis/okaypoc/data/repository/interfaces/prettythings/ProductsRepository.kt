package com.okaythis.okaypoc.data.repository.interfaces.prettythings

import com.okaythis.okaypoc.data.models.prettythings.Product


interface ProductsRepository {
    fun fetchProducts(): ArrayList<Product>
}