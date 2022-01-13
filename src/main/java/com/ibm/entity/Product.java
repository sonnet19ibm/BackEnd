package com.ibm.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ProductCategory category;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    //Default constructor
    public Product() {
    	super();
    }
    
    //Constructor using fields
    public Product(Long id, ProductCategory category, String name, String description,
			BigDecimal unitPrice, boolean active, int unitsInStock, Date dateCreated,
			Date lastUpdated) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.active = active;
		this.unitsInStock = unitsInStock;
	}
    
    //Getters and Setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public ProductCategory getCategory() {
			return category;
		}

		public void setCategory(ProductCategory category) {
			this.category = category;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public BigDecimal getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(BigDecimal unitPrice) {
			this.unitPrice = unitPrice;
		}

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}

		public int getUnitsInStock() {
			return unitsInStock;
		}

		public void setUnitsInStock(int unitsInStock) {
			this.unitsInStock = unitsInStock;
		}
 
	}

