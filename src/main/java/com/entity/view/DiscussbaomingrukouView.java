package com.entity.view;

import com.entity.DiscussbaomingrukouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报名入口评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
@TableName("discussbaomingrukou")
public class DiscussbaomingrukouView  extends DiscussbaomingrukouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbaomingrukouView(){
	}
 
 	public DiscussbaomingrukouView(DiscussbaomingrukouEntity discussbaomingrukouEntity){
 	try {
			BeanUtils.copyProperties(this, discussbaomingrukouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
