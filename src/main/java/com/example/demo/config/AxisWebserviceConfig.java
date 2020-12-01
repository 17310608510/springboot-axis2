package com.example.demo.config;

import org.apache.axis2.extensions.spring.receivers.ApplicationContextHolder;
import org.apache.axis2.transport.http.AxisServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.common.FileCopyUtils;

/**
 * @author 作者 zuoruibo:
 * @date 创建时间：2020年12月1日 下午4:53:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Configuration
public class AxisWebserviceConfig {
	private final static Logger log = LoggerFactory.getLogger(AxisWebserviceConfig.class);

	@Bean
	public ServletRegistrationBean<AxisServlet> axisServlet() {
		ServletRegistrationBean<AxisServlet> registrationBean = new ServletRegistrationBean<>();
		registrationBean.setServlet(new AxisServlet());
		registrationBean.addUrlMappings("/services/*");
		//
		String path = this.getClass().getResource("/ServicePath").getPath().toString();
		if (path.toLowerCase().startsWith("file:")) {
			path = path.substring(5);
		}
		if (path.indexOf("!") != -1) {
			try {
				FileCopyUtils.copy("ServicePath/services/myService/META-INF/services.xml");
			} catch (Exception e) {
				e.printStackTrace();
			}
			path = path.substring(0, path.lastIndexOf("/", path.indexOf("!"))) + "/ServicePath";
		}
		log.info("xml配置文件path={}", "{" + path + "}");
		registrationBean.addInitParameter("axis2.repository.path", path);
		registrationBean.setLoadOnStartup(1);
		return registrationBean;
	}

	@Bean
	public ApplicationContextHolder getApplicationContextHolder() {
		return new ApplicationContextHolder();
	}
}
