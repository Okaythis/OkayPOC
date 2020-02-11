package com.okaythis.okaypoc.data.models.prettythings


data class Product(val name: String,
                   val price: Int,
                   val imageUrl: String? ="",
                   val currency: Char ='$')