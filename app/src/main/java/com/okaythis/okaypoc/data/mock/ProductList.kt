package com.okaythis.okaypoc.data.mock

import com.okaythis.okaypoc.data.models.prettythings.Product

class ProductList {

    companion object  {
        fun fetchProducts(): ArrayList<Product> {
            val list =  ArrayList<Product>().apply {
                add(Product("Pretty Chair", 200))
                add(Product("Flexible Pretty Chair", 400))
            }
            return list
        }
    }


}