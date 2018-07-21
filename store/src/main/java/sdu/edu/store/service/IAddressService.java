package sdu.edu.store.service;

import java.util.List;

import sdu.edu.store.entity.Address;

public interface IAddressService {

	void addressAdmin(String userName,String receiverName, String receiverProvince, String receiverCity, String receiverArea,
			String receiverAddress, String receiverMobile,String receiverPhone, String receiverZip, String addressName);

	List<Address> findAddressDetails(String userName);

}
