package com.imooc.b2b.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.b2b.entity.ProductCategory;

public interface ProductCategoryDao {
	/**
	 * 通过shop id 查询店铺商品类别
	 * @param shopId
	 * @return
	 */
	
	List<ProductCategory> queryProductCategoryList(long shopId);
	
	/**
	 * 批量新增商品类别
	 * @param productCategoryList
	 * @return
	 */
	int batchInsertProductCategory(List<ProductCategory> productCategoryList);
	
	/**
	 * 根据productCategoryId和shopId删除数据
	 * @param productCategoryId
	 * @param shopId
	 * @return
	 */
	public int deleteProductCategory(@Param("productCategoryId") long productCategoryId,
			@Param("shopId") long shopId);
}
