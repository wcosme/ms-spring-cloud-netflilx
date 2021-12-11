package br.com.wgsolution.msproduct.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.wgsolution.msproduct.entity.Product;
import br.com.wgsolution.msproduct.entity.dto.ProductDTO;
import br.com.wgsolution.msproduct.exception.ResourceNotFoundException;
import br.com.wgsolution.msproduct.repository.ProductRepository;
import br.com.wgsolution.msproduct.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public ProductDTO create(ProductDTO dto) {
		ProductDTO productDTORetorno = ProductDTO.createProduct(productRepository.save(Product.createProduct(dto)));
		return productDTORetorno;
		
	}
	
	public Page<ProductDTO> findAll(Pageable pageable){
		var page = productRepository.findAll(pageable);
		
		return page.map(this::convertToProductDTO);
	}
	
	public ProductDTO findById(Long id) {
		var entity = productRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		
		return ProductDTO.createProduct(entity);
	}
	
	public ProductDTO update(ProductDTO productDTO) {
		final Optional<Product> optional = productRepository.findById(productDTO.getId());
		
		if(!optional.isPresent()) {
			new ResourceNotFoundException("No records found for this ID");
		}		
		return ProductDTO.createProduct(productRepository.save(Product.createProduct(productDTO)));
	}
	
	public void delete(Long id) {
		var entity = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		productRepository.delete(entity);
	}

	private ProductDTO convertToProductDTO(Product product) {
		return ProductDTO.createProduct(product);
	}
}
