package br.com.wgsolution.msproduct.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import br.com.wgsolution.msproduct.entity.dto.ProductDTO;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_PRODUCT")
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "inventory", nullable = false, length = 10)
	private String inventory;
	
	@Column(name = "price", nullable = false, length = 10)
	private Double price;
	
	public static Product createProduct(ProductDTO dto) {
		return new ModelMapper().map(dto, Product.class);
	}
}
