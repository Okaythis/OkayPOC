package com.okaythis.okaypoc.data.repository.prettythings

import com.okaythis.okaypoc.data.mock.ProductList
import com.okaythis.okaypoc.data.models.prettythings.Product
import com.okaythis.okaypoc.data.repository.interfaces.prettythings.ProductsRepository

class ProductsRepositoryImpl() : ProductsRepository {
    override fun fetchProducts(): ArrayList<Product> {
        return ProductList.fetchProducts()
    }
}