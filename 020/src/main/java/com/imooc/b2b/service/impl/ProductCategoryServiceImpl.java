package com.imooc.b2b.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imooc.b2b.dao.ProductCategoryDao;
import com.imooc.b2b.dto.ProductCategoryExecution;
import com.imooc.b2b.entity.ProductCategory;
import com.imooc.b2b.enums.ProductCategoryStateEnum;
import com.imooc.b2b.exceptions.ProductCategoryOperationException;
import com.imooc.b2b.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
	
	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	@Override
	public List<ProductCategory> getProductCategoryList(long shopId){
		return productCategoryDao.queryProductCategoryList(shopId); 
	}
	
	@Override
	@Transactional
	public ProductCategoryExecution batchAddProductCategory(List<ProductCategory> productCategoryList)
			throws ProductCategoryOperationException{
		if(productCategoryList != null && productCategoryList.size() > 0) {
			try {
				int effectedNum = productCategoryDao.batchInsertProductCategory(productCategoryList);
				if(effectedNum <= 0) {
					throw new ProductCategoryOperationException("店铺类别创建失败");
				}else {
					return new ProductCategoryExecution(ProductCategoryStateEnum.SUCCESS);
				}
				
			}catch(Exception e) {
				throw new ProductCategoryOperationException("batchAddProductCategory error:" + e.getMessage());
			}
		}else {
			return new ProductCategoryExecution(ProductCategoryStateEnum.EMPTY_LIST);
		}
	}
	

	@Override
	@Transactional
	public ProductCategoryExecution deleteProductCategory(long productCategoryId, long shopId){
		//将此类商品类别下的商品的商品类别置为null
		
		try {
			int effectNum = productCategoryDao.deleteProductCategory(productCategoryId, shopId);
			if(effectNum <= 0) {
				throw new ProductCategoryOperationException("商品类别添加失败");
			}else {
				return new ProductCategoryExecution(ProductCategoryStateEnum.SUCCESS);
			}
		}catch(Exception e) {
			throw new ProductCategoryOperationException("delete productCategory Error:" + e.getMessage());
		}
	}
}
