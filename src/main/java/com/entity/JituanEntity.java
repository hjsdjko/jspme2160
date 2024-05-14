package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 集团
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-21 15:54:45
 */
@TableName("jituan")
public class JituanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JituanEntity() {
		
	}
	
	public JituanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 集团名
	 */
					
	private String jituanming;
	
	/**
	 * 集团地址
	 */
					
	private String jituandizhi;
	
	/**
	 * 法定代表人
	 */
					
	private String fadingdaibiaoren;
	
	/**
	 * 注册资本
	 */
					
	private String zhuceziben;
	
	/**
	 * 集团邮箱
	 */
					
	private String jituanyouxiang;
	
	/**
	 * 官网
	 */
					
	private String guanwang;
	
	/**
	 * 社会统一代码
	 */
					
	private String shehuitongyidaima;
	
	/**
	 * 集团电话
	 */
					
	private String jituandianhua;
	
	/**
	 * 成立日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chengliriqi;
	
	/**
	 * 投资人
	 */
					
	private String touziren;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：集团名
	 */
	public void setJituanming(String jituanming) {
		this.jituanming = jituanming;
	}
	/**
	 * 获取：集团名
	 */
	public String getJituanming() {
		return jituanming;
	}
	/**
	 * 设置：集团地址
	 */
	public void setJituandizhi(String jituandizhi) {
		this.jituandizhi = jituandizhi;
	}
	/**
	 * 获取：集团地址
	 */
	public String getJituandizhi() {
		return jituandizhi;
	}
	/**
	 * 设置：法定代表人
	 */
	public void setFadingdaibiaoren(String fadingdaibiaoren) {
		this.fadingdaibiaoren = fadingdaibiaoren;
	}
	/**
	 * 获取：法定代表人
	 */
	public String getFadingdaibiaoren() {
		return fadingdaibiaoren;
	}
	/**
	 * 设置：注册资本
	 */
	public void setZhuceziben(String zhuceziben) {
		this.zhuceziben = zhuceziben;
	}
	/**
	 * 获取：注册资本
	 */
	public String getZhuceziben() {
		return zhuceziben;
	}
	/**
	 * 设置：集团邮箱
	 */
	public void setJituanyouxiang(String jituanyouxiang) {
		this.jituanyouxiang = jituanyouxiang;
	}
	/**
	 * 获取：集团邮箱
	 */
	public String getJituanyouxiang() {
		return jituanyouxiang;
	}
	/**
	 * 设置：官网
	 */
	public void setGuanwang(String guanwang) {
		this.guanwang = guanwang;
	}
	/**
	 * 获取：官网
	 */
	public String getGuanwang() {
		return guanwang;
	}
	/**
	 * 设置：社会统一代码
	 */
	public void setShehuitongyidaima(String shehuitongyidaima) {
		this.shehuitongyidaima = shehuitongyidaima;
	}
	/**
	 * 获取：社会统一代码
	 */
	public String getShehuitongyidaima() {
		return shehuitongyidaima;
	}
	/**
	 * 设置：集团电话
	 */
	public void setJituandianhua(String jituandianhua) {
		this.jituandianhua = jituandianhua;
	}
	/**
	 * 获取：集团电话
	 */
	public String getJituandianhua() {
		return jituandianhua;
	}
	/**
	 * 设置：成立日期
	 */
	public void setChengliriqi(Date chengliriqi) {
		this.chengliriqi = chengliriqi;
	}
	/**
	 * 获取：成立日期
	 */
	public Date getChengliriqi() {
		return chengliriqi;
	}
	/**
	 * 设置：投资人
	 */
	public void setTouziren(String touziren) {
		this.touziren = touziren;
	}
	/**
	 * 获取：投资人
	 */
	public String getTouziren() {
		return touziren;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
