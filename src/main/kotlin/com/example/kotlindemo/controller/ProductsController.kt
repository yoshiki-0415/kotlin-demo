package com.example.kotlindemo.controller

import com.example.kotlindemo.model.ProductModel
import com.example.kotlindemo.service.ProductService
import org.springframework.web.bind.annotation.*


@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
class ProductsController (private var productService: ProductService) {

    @GetMapping("/products")
    fun getAll(): List<ProductModel>? {
        return productService?.getAll()
    }

    @GetMapping("/product/{id}")
    fun getById(@PathVariable id: Integer): ProductModel? {
        return productService?.getById(id)
    }

    @PostMapping("/product")
    fun create(@RequestBody model: ProductModel) {
        productService.register(model)
    }

    @PutMapping("/product")
    fun update(@RequestBody model: ProductModel) {
        productService.modify(model)
    }

    @DeleteMapping("/product/{id}")
    fun delete(@PathVariable id: Integer) {
        productService.delete(id)
    }
}