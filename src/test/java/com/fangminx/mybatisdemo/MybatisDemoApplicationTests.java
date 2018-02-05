package com.fangminx.mybatisdemo;

import com.fangminx.dao.b.VendorAliasMapper;
import com.fangminx.domain.c.VendorAlias;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(value = "com.fangminx.dao", sqlSessionFactoryRef= "sqlSessionFactory")
public class MybatisDemoApplicationTests {

	@Autowired(required = false)
	VendorAliasMapper vendorAliasMapper;

	@Test
	public void testFind() {
		VendorAlias v = vendorAliasMapper.selectByPrimaryKey(1L);
		System.out.println(v.getCode());
		Assert.assertNotNull(v);
	}

}
