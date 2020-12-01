package com.example.demo.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Response;
import com.example.demo.entity.User;
import com.example.demo.service.DemoService;
import com.google.common.collect.Lists;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年12月1日 下午4:49:22 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Service("demoService")
@WebService(endpointInterface = "com.example.demo.service.impl.DemoServiceImpl")
public class DemoServiceImpl implements DemoService{

	@Override
	public Response listUser(String id) {
		User user1 = new User();
        user1.setName("张三");
        user1.setBirthday("2020-01-01");
        user1.setAge("20");
        return Response.SUCCESS(Lists.newArrayList(user1,user1));
	}

}
