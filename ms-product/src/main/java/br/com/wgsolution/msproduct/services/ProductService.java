package br.com.wgsolution.msproduct.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.wgsolution.msproduct.entity.dto.ProductDTO;

public interface ProductService {
	
	ProductDTO create(ProductDTO dto);
	Page<ProductDTO> findAll(Pageable pageable);
	ProductDTO findById(Long id);
	ProductDTO update(ProductDTO productDTO);
	void delete(Long id);

}
