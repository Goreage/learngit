package com.imooc.b2b.dao;

import java.util.List;

import com.imooc.b2b.entity.Area;

public interface AreaDao {
	/**
	 * 列出区域列表
	 * @return areaList
	 */
	List<Area> queryArea();
}
