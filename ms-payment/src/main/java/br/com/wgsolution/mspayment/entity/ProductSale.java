package br.com.wgsolution.mspayment.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_PRODUCT_SALE")
public class ProductSale implements Serializable{

	private static final long serialVersionUID = 1L;

}
