package sdu.edu.store.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.edu.store.entity.Goods;
import sdu.edu.store.entity.GoodsCategory;
import sdu.edu.store.entity.User;
import sdu.edu.store.service.IGoodsCategoryService;
import sdu.edu.store.service.IGoodsService;

@Controller
@RequestMapping("/page")
public class PageController {
	@Resource
	private IGoodsCategoryService goodsCategoryService;

	@Resource
	private IGoodsService goodsService;

	/**
	 * 相应商品分类列表页面
	 * 
	 * @param categoryId
	 * @return
	 */
	@RequestMapping("/list.do")
	public String list(Integer categoryId, ModelMap map) {

		GoodsCategory category = goodsCategoryService.findCategory(categoryId);
		GoodsCategory brance = goodsCategoryService.findCategory(category.getParentId());
		GoodsCategory root = goodsCategoryService.findCategory(brance.getParentId());

		List<Goods> list = goodsService.findGoodsByCategory(categoryId);

		map.put("root", root);
		map.put("brance", brance);
		map.put("category", category);
		map.put("goods", list);

		return "goodsList";
	}
	
	@RequestMapping("/orders.do")
	public String orders(HttpServletRequest request, ModelMap map) {
		return "orders";
	}

	@RequestMapping("/address.do")
	public String address(HttpServletRequest request, ModelMap map) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("loginUser");
		System.out.println(user);
		map.put("loginUser", user);
		return "addressAdmin";
	}
}
