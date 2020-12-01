package com.example.demo.config;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年12月1日 下午4:59:11 
 * @version 1.0 
 * @parameter 
 * @since 数据适配器
 * @return 
 */
public class DataAdapter extends XmlAdapter<Object,Object>{

	//java→xml时的处理，ob是Java生成xml时传入的属性值，ob可以数组、集合等其它复杂类型，
    //在这个方法中可以对其进行处理，return返回需要的结果类型
    @Override
    public Object marshal(Object ob) throws Exception {

        if(ob == null || ob.equals("")){ //当字段为空时在返回xml时用空格占位，防止xml节点自闭和，防止为空的属性不返回
            ob=" ";
        }
        return ob;
    }

    //xml→java时的处理
    @Override
    public Object unmarshal(Object arg0) throws Exception {
        // TODO Auto-generated method stub
        return arg0;
    }
}
