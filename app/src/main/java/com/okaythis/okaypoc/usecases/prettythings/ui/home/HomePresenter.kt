package com.okaythis.okaypoc.usecases.prettythings.ui.home

import com.okaythis.okaypoc.data.models.prettythings.Product
import com.okaythis.okaypoc.data.repository.interfaces.prettythings.ProductsRepository
import com.okaythis.okaypoc.data.repository.prettythings.ProductsRepositoryImpl

class HomePresenter(private val productsRepository: ProductsRepository): HomeContract.Actions {
    override fun loadProducts(): ArrayList<Product> {
        return productsRepository.fetchProducts()
    }
}