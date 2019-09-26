package com.imooc.b2b.service;


import java.io.InputStream;

import com.imooc.b2b.dto.ShopExecution;
import com.imooc.b2b.entity.Shop;
import com.imooc.b2b.exceptions.ShopOperationException;

public interface ShopService {
	/**
	 * 根据shopCondition分页返回响应店铺列表
	 * @param shopCondition
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
	
	/**
	 * 通过店铺Id获取店铺信息
	 * @param shopId
	 * @param shopImgInputStream
	 * @param fileName
	 * @return
	 * @throws ShopOperationException
	 */
	Shop getByShopId(long shopId);
	
	/**
	 * 更新店铺信息，包括对图片的处理
	 * @param shop
	 * @param shopImgInputStream
	 * @param fileName
	 * @return
	 * @throws ShopOperationException
	 */
	ShopExecution modifyShop(Shop shop, InputStream shopImgInputStream, String fileName)throws ShopOperationException;
	ShopExecution addShop(Shop shop,InputStream shopImgInputStream, String fileName) throws ShopOperationException;
}
