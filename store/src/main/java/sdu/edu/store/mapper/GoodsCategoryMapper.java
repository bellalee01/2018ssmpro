package sdu.edu.store.mapper;

import java.util.List;

import sdu.edu.store.entity.GoodsCategory;


public interface GoodsCategoryMapper {

	List<GoodsCategory> getCategories(Integer rootId);

	GoodsCategory findGoodsCategoryById(Integer rootId);
}
