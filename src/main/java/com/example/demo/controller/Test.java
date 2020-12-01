package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者 zuoruibo:
 * @date 创建时间：2020年12月1日 下午5:13:17
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@RestController
@RequestMapping("/test")
public class Test {

	@RequestMapping("/get")
	public String getStr() {
		return "hello啊";
	}
}
