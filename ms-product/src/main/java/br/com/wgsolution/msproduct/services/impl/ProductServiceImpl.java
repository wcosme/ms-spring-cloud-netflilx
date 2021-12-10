package br.com.wgsolution.msproduct.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wgsolution.msproduct.entity.dto.ProductDTO;
import br.com.wgsolution.msproduct.repository.ProductRepository;
import br.com.wgsolution.msproduct.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public ProductDTO create(ProductDTO prod) {
		return null;
		
	}

}
