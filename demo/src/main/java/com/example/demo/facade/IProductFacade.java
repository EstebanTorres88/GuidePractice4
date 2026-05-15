package com.example.demo.facade;

import java.util.List;

import com.example.demo.dtos.ProductDTO;

public interface IProductFacade {

    List<ProductDTO> getAll();
    
}
