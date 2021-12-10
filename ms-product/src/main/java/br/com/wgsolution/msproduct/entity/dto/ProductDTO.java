package br.com.wgsolution.msproduct.entity.dto;

import java.io.Serializable;

import org.modelmapper.ModelMapper;

import br.com.wgsolution.msproduct.entity.Product;
import lombok.Data;

@Data
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String inventory;
	private Double price;
	
	public static ProductDTO createProduct(Product product) {
		return new ModelMapper().map(product, ProductDTO.class);
	}

}
