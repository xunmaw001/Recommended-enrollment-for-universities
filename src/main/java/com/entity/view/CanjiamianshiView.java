package com.entity.view;

import com.entity.CanjiamianshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 参加面试
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
@TableName("canjiamianshi")
public class CanjiamianshiView  extends CanjiamianshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanjiamianshiView(){
	}
 
 	public CanjiamianshiView(CanjiamianshiEntity canjiamianshiEntity){
 	try {
			BeanUtils.copyProperties(this, canjiamianshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
