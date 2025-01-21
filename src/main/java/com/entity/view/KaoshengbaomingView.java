package com.entity.view;

import com.entity.KaoshengbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考生报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
@TableName("kaoshengbaoming")
public class KaoshengbaomingView  extends KaoshengbaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshengbaomingView(){
	}
 
 	public KaoshengbaomingView(KaoshengbaomingEntity kaoshengbaomingEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshengbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
