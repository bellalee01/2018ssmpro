package sdu.edu.store.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sdu.edu.store.entity.GoodsCategory;
import sdu.edu.store.service.IGoodsCategoryService;

@Controller
@RequestMapping("/goods")
public class GoodsController extends BaseController{
	
	@Resource
	private IGoodsCategoryService goodsCategoryService;
	
	@RequestMapping("/categories.do")
	@ResponseBody
	public Result  categories(Integer id){
		List<GoodsCategory> list = goodsCategoryService.findCategories(id);
		return new Result(list);
	}
	
}
