package com.okaythis.okaypoc.usecases.prettythings.list.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.okaythis.okaypoc.R
import com.okaythis.okaypoc.data.models.prettythings.Product
import kotlinx.android.synthetic.main.activity_main.view.*

class ProductListAdapter(private var products: ArrayList<Product>) :
    RecyclerView.Adapter<ProductListAdapter.ProducListViewHolder>() {

    class ProducListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProducListViewHolder {

        return ProducListViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.product_item_card, parent, false) as CardView
        )

    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProducListViewHolder, position: Int) {
        setCardDetails(products[position], holder.itemView)
    }

    fun replaceProducts(newProducts: ArrayList<Product>) {
        products.clear()
        products.addAll(newProducts)
        notifyDataSetChanged()
    }

    private fun setCardDetails(product: Product, card: View) {
        if (product.imageUrl!!.isNotEmpty()) {
            // use glide or picasso to add image to card background
        }

        card.findViewById<TextView>(R.id.productNameTextView).apply {
            text = product.name
        }
        card.findViewById<TextView>(R.id.productPriceTextView).apply {
            text = product.price.toString()
        }
        card.findViewById<TextView>(R.id.currencyTypeTextView).apply {
            text = product.currency.toString()
        }
    }
}

