package com.entity.model;

import com.entity.ZonghechengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 综合成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public class ZonghechengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 综合成绩
	 */
	
	private Float zonghechengji;
		
	/**
	 * 综合排名
	 */
	
	private Integer zonghepaiming;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 结果
	 */
	
	private String jieguo;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
	 * 设置：综合成绩
	 */
	 
	public void setZonghechengji(Float zonghechengji) {
		this.zonghechengji = zonghechengji;
	}
	
	/**
	 * 获取：综合成绩
	 */
	public Float getZonghechengji() {
		return zonghechengji;
	}
				
	
	/**
	 * 设置：综合排名
	 */
	 
	public void setZonghepaiming(Integer zonghepaiming) {
		this.zonghepaiming = zonghepaiming;
	}
	
	/**
	 * 获取：综合排名
	 */
	public Integer getZonghepaiming() {
		return zonghepaiming;
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
	 * 设置：结果
	 */
	 
	public void setJieguo(String jieguo) {
		this.jieguo = jieguo;
	}
	
	/**
	 * 获取：结果
	 */
	public String getJieguo() {
		return jieguo;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
