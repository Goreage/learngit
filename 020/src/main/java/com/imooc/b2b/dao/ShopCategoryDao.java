package com.imooc.b2b.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imooc.b2b.entity.ShopCategory;

public interface ShopCategoryDao {
	List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition")
	ShopCategory shopCategoryCondition);
}
