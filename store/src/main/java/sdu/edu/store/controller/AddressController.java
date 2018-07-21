package sdu.edu.store.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sdu.edu.store.entity.Address;
import sdu.edu.store.entity.GoodsCategory;
import sdu.edu.store.entity.User;
import sdu.edu.store.service.IAddressService;

@Controller
@RequestMapping("/address")
public class AddressController extends BaseController{
	
	@Resource 
	IAddressService addressService;
	
	@RequestMapping("/addressAdmin.do")
	@ResponseBody
	public Result addressAdmin(String userName,String receiverName, String receiverProvince, String receiverCity, String receiverArea, 
			String receiverAddress,String receiverMobile,String receiverPhone,String receiverZip,String addressName,ModelMap map){
		try{
			System.out.println(receiverName+","+receiverProvince+","+receiverCity+receiverArea+","+
					receiverAddress+","+receiverMobile+","+receiverPhone+","+receiverZip+addressName);
			addressService.addressAdmin(userName,receiverName, receiverProvince, receiverCity, receiverArea,
					receiverAddress,receiverMobile,receiverPhone,receiverZip,addressName);
			System.out.println("addAddress()"); 
			return new Result("成功");
		}catch(Exception e){
			e.printStackTrace();
			map.put("message", e.getMessage());
			return new Result(e); 
		}
		
	}
	@RequestMapping("/addressShow.do")
	@ResponseBody
	public Result address(String userName,ModelMap map){
		try{
		List<Address> list = addressService.findAddressDetails(userName);
		for (Address g : list) {
			System.out.println(g); 
		}
		return new Result(list);
		}catch(Exception e){
			e.printStackTrace();
			map.put("message", e.getMessage());
			return new Result(e); 
		}	
	}	
}
