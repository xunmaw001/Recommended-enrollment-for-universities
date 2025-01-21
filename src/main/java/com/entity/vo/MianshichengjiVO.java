package com.entity.vo;

import com.entity.MianshichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 面试成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public class MianshichengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 面试成绩
	 */
	
	private Float mianshichengji;
		
	/**
	 * 成绩排名
	 */
	
	private Integer chengjipaiming;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 评分日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingfenriqi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：面试成绩
	 */
	 
	public void setMianshichengji(Float mianshichengji) {
		this.mianshichengji = mianshichengji;
	}
	
	/**
	 * 获取：面试成绩
	 */
	public Float getMianshichengji() {
		return mianshichengji;
	}
				
	
	/**
	 * 设置：成绩排名
	 */
	 
	public void setChengjipaiming(Integer chengjipaiming) {
		this.chengjipaiming = chengjipaiming;
	}
	
	/**
	 * 获取：成绩排名
	 */
	public Integer getChengjipaiming() {
		return chengjipaiming;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：评分日期
	 */
	 
	public void setPingfenriqi(Date pingfenriqi) {
		this.pingfenriqi = pingfenriqi;
	}
	
	/**
	 * 获取：评分日期
	 */
	public Date getPingfenriqi() {
		return pingfenriqi;
	}
			
}
