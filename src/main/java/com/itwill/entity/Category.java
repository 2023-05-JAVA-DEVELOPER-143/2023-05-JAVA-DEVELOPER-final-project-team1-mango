package com.itwill.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.itwill.entity.product.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter @Setter
public class Category {

	    @Id @GeneratedValue
	    @Column(name = "categoryId")
	    private Long id;

	    private String name;

	    @ManyToMany
	    @JoinTable(name = "categoryProduct",
	            joinColumns = @JoinColumn(name = "categoryId"),
	            inverseJoinColumns = @JoinColumn(name = "productId"))
	    private List<Product> products= new ArrayList();

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "parentId")
	    private Category parent;

	    @OneToMany(mappedBy = "parent")
	    private List<Category> child= new ArrayList<>();
	    
	    //==연관관계 메서드==//
	    public void addChildCategory(Category child) {
	        this.child.add(child);
	        child.setParent(this);
	    }
	}

