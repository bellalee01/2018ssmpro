package sdu.edu.store.mapper;

import java.util.List;

import sdu.edu.store.entity.Goods;

public interface GoodsMapper {
	List<Goods> findGoodsByCategory(Integer categoryId);
}
