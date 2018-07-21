package sdu.edu.store.service;

import java.util.List;

import sdu.edu.store.entity.GoodsCategory;


public interface IGoodsCategoryService {

	List<GoodsCategory> findCategories(Integer rootId);
	
	GoodsCategory findCategory(Integer categoryId);
}
