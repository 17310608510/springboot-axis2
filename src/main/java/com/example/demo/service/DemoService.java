package com.example.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.example.demo.entity.Response;


/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年12月1日 下午4:47:21 
 * @version 1.0 
 * @parameter 
 * @since 服务接口类
 * @return 
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC,use = SOAPBinding.Use.LITERAL)
public interface DemoService {
	@WebMethod
    public Response listUser(String id);
}
