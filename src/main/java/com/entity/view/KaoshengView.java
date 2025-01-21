package com.entity.view;

import com.entity.KaoshengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
@TableName("kaosheng")
public class KaoshengView  extends KaoshengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshengView(){
	}
 
 	public KaoshengView(KaoshengEntity kaoshengEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
