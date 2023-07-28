package com.pms.dao;

import com.pms.entity.Product;
import com.pms.entity.Supplier;

public interface ProductDao {
boolean addProduct(Product pro);
public int updateProduct(int sku,double price);
public int getProductBySku(int sku);
public int sortProductBySku();
public int getProduct();
}