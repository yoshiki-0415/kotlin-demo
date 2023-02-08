package com.example.kotlindemo.mapper

import com.example.kotlindemo.model.ProductModel
import org.apache.ibatis.annotations.Mapper

@Mapper
interface ProductMapper {
    fun selectAll(): List<ProductModel>
    fun selectById(id: Integer): ProductModel
    fun insert(model: ProductModel)
    fun update(model: ProductModel)
    fun delete(id: Integer)
}