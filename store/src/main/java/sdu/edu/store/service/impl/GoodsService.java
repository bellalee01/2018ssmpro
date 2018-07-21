package sdu.edu.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sdu.edu.store.entity.Goods;
import sdu.edu.store.entity.GoodsCategory;
import sdu.edu.store.mapper.GoodsCategoryMapper;
import sdu.edu.store.mapper.GoodsMapper;
import sdu.edu.store.service.IGoodsService;
import sdu.edu.store.service.ex.ServiceException;

@Service
public class GoodsService implements IGoodsService {

	@Resource
	private GoodsMapper googdsMapper;
	
	@Resource
	private GoodsCategoryMapper goodsCategoryMapper;
	
	public List<Goods> findGoodsByCategory(Integer categoryId) {
		
		GoodsCategory category = goodsCategoryMapper.findGoodsCategoryById(categoryId);
		if(category==null){
			throw new ServiceException("分类ID错误");
		}
		
		return googdsMapper.findGoodsByCategory(categoryId);
	}

}
