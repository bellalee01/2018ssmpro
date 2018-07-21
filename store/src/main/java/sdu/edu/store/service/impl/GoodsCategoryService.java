package sdu.edu.store.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sdu.edu.store.entity.GoodsCategory;
import sdu.edu.store.mapper.GoodsCategoryMapper;
import sdu.edu.store.service.IGoodsCategoryService;
import sdu.edu.store.service.ex.ServiceException;

@Service
public class GoodsCategoryService implements IGoodsCategoryService {

	@Resource
	private GoodsCategoryMapper goodsCategoryMapper;
	
	public List<GoodsCategory> findCategories(Integer rootId) {
		if(rootId==null){
			throw new ServiceException("rootId不能为空");
		}
		
		GoodsCategory root = goodsCategoryMapper.findGoodsCategoryById(rootId);
		if(root==null || root.getParentId()!=0){
			throw new ServiceException("不是rootID");
		}
		
		return goodsCategoryMapper.getCategories(rootId); 
	}

	public GoodsCategory findCategory(Integer categoryId) {
		GoodsCategory category = goodsCategoryMapper.findGoodsCategoryById(categoryId);
		if(category==null){
			throw new ServiceException("categoryId错误");
		}
		return category;
	}
}
