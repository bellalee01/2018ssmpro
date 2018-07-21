package store.test;


import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sdu.edu.store.entity.Address;
import sdu.edu.store.entity.Goods;
import sdu.edu.store.entity.GoodsCategory;
import sdu.edu.store.entity.IdList;
import sdu.edu.store.entity.User;
import sdu.edu.store.mapper.AddressMapper;
import sdu.edu.store.mapper.GoodsCategoryMapper;
import sdu.edu.store.mapper.UserMapper;
import sdu.edu.store.service.IGoodsService;
import sdu.edu.store.service.IUserService;


public class TestCase {
	
	ClassPathXmlApplicationContext ctx;
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
	}
	
	@After
	public void destory(){
		ctx.close();
	}
	
	@Test
	public void testAddUser(){
		UserMapper mapper=ctx.getBean("userMapper", UserMapper.class);
		User user=new User(2, "Tommy", "123", "110", "119", 1, "Tom", "20180711","Tom", "20180711");
		int n = mapper.addUser(user);
		System.out.println(n); 
	}
	@Test
	public void testRegist(){
		IUserService service = ctx.getBean("userService", IUserService.class);
		service.regist("Jerry", "123", "123", "123@tedu.cn", "110"); 
	}
	@Test
	public void testGetCategories(){
		GoodsCategoryMapper mapper = ctx.getBean("goodsCategoryMapper", GoodsCategoryMapper.class);
		List<GoodsCategory> list = mapper.getCategories(161);
		for (GoodsCategory goodsCategory : list) {
			System.out.println(goodsCategory); 
		}
	}
	@Test
	public void testFindGoodsByCategory(){
		IGoodsService service = ctx.getBean("goodsService", IGoodsService.class);
		List<Goods> list = service.findGoodsByCategory(163);
		for (Goods g : list) {
			System.out.println(g); 
		}
	}
	@Test
	public void hashTest(){
		String str = "123123";
		String md5 = DigestUtils.md5Hex(str);
		System.out.println(md5); 
		str = "123124";
		md5 = DigestUtils.md5Hex(str);
		System.out.println(md5); 
		
		str = "123124今天你吃了吗";
		md5 = DigestUtils.md5Hex(str);
		System.out.println(md5); 
	}
	@Test
	public void testAddaddress(){
		AddressMapper mapper=ctx.getBean("addressMapper", AddressMapper.class);
		IdList list = mapper.findId("北京市","市辖区","朝阳区");
	    System.out.println(list); 
	}
	@Test
	public void testUserId(){
		AddressMapper mapper=ctx.getBean("addressMapper", AddressMapper.class);
		Date date = new Date();
		Address address = new Address(101,1,"1","1","1",
				"1","1","1","1","1","1",
				"1",0,"1",date,"1",date);
		int list = mapper.addAddress(address);
	    System.out.println(list); 
	}
	@Test
	public void findAddress(){
		AddressMapper mapper=ctx.getBean("addressMapper", AddressMapper.class);
		List<Address> list = mapper.getAddressDetails("lxf101");
		for (Address g : list) {
			System.out.println(g); 
		}
	}
	
}

