package sdu.edu.store.service.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sdu.edu.store.entity.Address;
import sdu.edu.store.entity.GoodsCategory;
import sdu.edu.store.entity.IdList;
import sdu.edu.store.mapper.AddressMapper;
import sdu.edu.store.service.IAddressService;
import sdu.edu.store.service.ex.ServiceException;

@Service//注解一定要写全了
public class AddressService implements IAddressService {

	@Resource
	private AddressMapper addressMapper;
	
	public void addressAdmin(String userName,String receiverName, String receiverProvince, String receiverCity, String receiverArea,
			String receiverAddress, String receiverMobile,String receiverPhone, String receiverZip, String addressName) {
		if(receiverName==null || receiverName.trim().isEmpty()){
			throw new ServiceException("收货人不能为空1！");
		}
		if(receiverProvince==null || receiverProvince.trim().isEmpty()){
			throw new ServiceException("省份不能为空1");
		}
		if(receiverCity==null || receiverCity.trim().isEmpty()){
			throw new ServiceException("城市不能为空1");
		}
		if(receiverArea==null || receiverArea.trim().isEmpty()){
			throw new ServiceException("区/县不能为空1");
		}
		if(receiverAddress==null || receiverAddress.trim().isEmpty()){
			throw new ServiceException("详细地址不能为空1");
		}
		if(receiverMobile==null || receiverMobile.trim().isEmpty()){
			throw new ServiceException("手机号码不能为空");
		}
		
		int length=receiverCity.length();
		String str = null;
		if (length >= 3) {
			str = receiverCity.substring(length - 3, length);
		}
		if (str.equals("市辖区")) {
			receiverCity = "市辖区";
		} else {
			if (length >= 2) {
				str = receiverCity.substring(length - 2, length);
			}
			if (str.equals("郊县")) {
				receiverCity = "县";
			}
		}
		System.out.println(receiverCity);
		IdList list = addressMapper.findId(receiverProvince,receiverCity,receiverArea);
		System.out.println(userName);
		int userId =addressMapper.findUid(userName);
		String receiverDistrict=receiverProvince+receiverCity+receiverArea;
		if(list.getProvince_code()==null || list.getProvince_code().trim().isEmpty()){
			throw new ServiceException("省份不能为空2");
		}
		if(list.getCity_code()==null || list.getCity_code().trim().isEmpty()){
			throw new ServiceException("城市不能为空2");
		}
		if(list.getArea_code()==null || list.getArea_code().trim().isEmpty()){
			throw new ServiceException("区/县不能为空2");
		}

		Date date = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = fmt.format(date);
		Address address = new Address(null,userId,receiverName,list.getProvince_code(),list.getCity_code(),
				list.getArea_code(),receiverDistrict,receiverAddress,receiverMobile,receiverPhone,receiverZip,
				addressName,0,userName,date,userName,date);
		int n = addressMapper.addAddress(address);
		if(n!=1){
			throw new ServiceException("数据保存异常："+n);
		}
	}

	public List<Address> findAddressDetails(String userName) {
		
		return addressMapper.getAddressDetails(userName); 

	}

	

}
