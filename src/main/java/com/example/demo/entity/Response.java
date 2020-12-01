package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年12月1日 下午3:20:57 
 * @version 1.0 
 * @parameter 
 * @since 统一的返回类
 * @return 
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name ="response")
@XmlSeeAlso(User.class)
public class Response implements Serializable{
	
	private String resultCode;
	
	private String resultDesc;
	
	private List<User> result;
	
	public static Response SUCCESS(List<User> list) {
		return new Response("0","success",list);
	}
	public static Response SUCCESS(String msg,List<User> list) {
		return new Response("0",msg,list);
	}
	public static Response ERROR() {
		return new Response("-1","操作失败",null);
	}
	public static Response ERROR(String code,String msg) {
		return new Response(code,msg,null);
	}
	
	public static Response ERROR(String msg) {
		return new Response("-1",msg,null);
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getReslutDesc() {
		return resultDesc;
	}

	public void setReslutDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public List<User> getResult() {
		return result;
	}

	public void setResult(List<User> result) {
		this.result = result;
	}
	
	public Response() {
		
	}
	
	public Response(String resultCode, String resultDesc,List<User> result) {
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
		this.result= result;
		
	}
	
	

}
