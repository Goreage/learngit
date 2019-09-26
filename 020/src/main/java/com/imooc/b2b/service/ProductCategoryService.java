package com.imooc.b2b.service;

import java.util.List;

import com.imooc.b2b.dto.ProductCategoryExecution;
import com.imooc.b2b.entity.ProductCategory;
import com.imooc.b2b.exceptions.ProductCategoryOperationException;

public interface ProductCategoryService {
	/**
	 * 查询指定某个店铺下的所有商品类别信息		
	 * @param shopId
	 * @throws 运行时异常 ProductCategoryOperationException
	 * @return
	 */
	List<ProductCategory> getProductCategoryList(long shopId);
	
	ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
	throws ProductCategoryOperationException;
	
	/**
	 * 将此类商品类别下的商品的类别id为空，再删除掉该商品类别
	 * @param productCategoryId
	 * @param shopId
	 * @return
	 */
	public ProductCategoryExecution deleteProductCategory(long productCategoryId, long shopId);
}
