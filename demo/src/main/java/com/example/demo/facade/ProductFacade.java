package com.example.demo.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dtos.ProductDTO;
import com.example.demo.mappers.ProductMapper;
import com.example.demo.services.IProductService;

@Component
public class ProductFacade implements IProductFacade{

    @Autowired
    private IProductService productService;
    

    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<ProductDTO> getAll() {
        return productMapper.toProductResponseDTOList(productService.getAll());
    }

}
