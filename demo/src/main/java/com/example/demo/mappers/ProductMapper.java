package com.example.demo.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dtos.ProductDTO;
import com.example.demo.entities.Product;
import com.example.demo.models.ProductResponseModel;

@Component
public class ProductMapper {


    public ProductDTO toProductResponseDTO(Product product){
        if (product == null) {
            return null;
        }

        return new ProductDTO(product.getName(), product.getDescription(), product.getPrice());





    }



    public List<ProductDTO> toProductResponseDTOList(List<Product> products){
        if (products == null) {
            return null;
        }

        return products.stream().map(this:: toProductResponseDTO).toList();


    }



    public ProductResponseModel toProductResponseModel(ProductDTO productDTO){
        if (productDTO == null) {
            return null;
        }


        return new ProductResponseModel(productDTO.name(), productDTO.description(), productDTO.price());

    }



    public List<ProductResponseModel> toProductResponseModelList(List<ProductDTO> productsDTO){
        if (productsDTO == null) {
            return null;
        }

        return productsDTO.stream().map(this::toProductResponseModel).toList();


    }
    
}
