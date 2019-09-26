package com.imooc.b2b.service;

import java.util.List;

import com.imooc.b2b.entity.ShopCategory;


public interface ShopCategoryService {
	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
