package sdu.edu.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sdu.edu.store.entity.Address;
import sdu.edu.store.entity.IdList;

public interface AddressMapper {

	IdList findId(@Param("receiverProvince")String receiverProvince,
			@Param("receiverCity")String receiverCity,
			@Param("receiverArea")String receiverArea);
	
	int findUid(@Param("userName")String userName);

	int addAddress(Address address);

	List<Address> getAddressDetails(String userName);


}
