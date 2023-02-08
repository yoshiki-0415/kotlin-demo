package com.example.kotlindemo.service.impl

import com.example.kotlindemo.mapper.ProductMapper
import com.example.kotlindemo.model.ProductModel
import com.example.kotlindemo.service.ProductService
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl (private var productMapper: ProductMapper): ProductService {
    override fun getAll() : List<ProductModel> {
        return productMapper.selectAll()
    }
    override fun getById(id: Integer): ProductModel {
        return productMapper.selectById(id)
    }
    override fun register(model: ProductModel) {
        productMapper.insert(model)
    }
    override fun modify(model: ProductModel) {
        productMapper.update(model)
    }
    override fun delete(id: Integer) {
        productMapper.delete(id)
    }
}