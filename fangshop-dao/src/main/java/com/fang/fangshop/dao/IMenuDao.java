package com.fang.fangshop.dao;

import com.fang.fangshop.core.dao.IDaoManager;
import com.fang.fangshop.core.system.been.Menu;

import java.util.List;

public interface IMenuDao extends IDaoManager<Menu> {
	public List<Menu> selectAll();
	public List<Menu> selectList(Object param);
	public int updateById(Menu menu);
}
