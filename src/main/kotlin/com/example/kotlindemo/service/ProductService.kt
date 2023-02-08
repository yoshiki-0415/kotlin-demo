package com.example.kotlindemo.service

import com.example.kotlindemo.model.ProductModel

interface ProductService {
    fun getAll() : List<ProductModel>
    fun getById(id: Integer): ProductModel
    fun register(model: ProductModel)
    fun modify(model: ProductModel)
    fun delete(id: Integer)
}