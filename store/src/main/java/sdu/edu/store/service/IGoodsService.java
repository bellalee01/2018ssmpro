package sdu.edu.store.service;

import java.util.List;

import sdu.edu.store.entity.Goods;

public interface IGoodsService {
	
	List<Goods> findGoodsByCategory(Integer categoryId);
	
}
