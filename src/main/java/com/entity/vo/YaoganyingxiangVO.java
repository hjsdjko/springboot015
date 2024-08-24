package com.entity.vo;

import com.entity.YaoganyingxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 遥感影像
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
public class YaoganyingxiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 影像分类
	 */
	
	private String yingxiangfenlei;
		
	/**
	 * 卫星数据集
	 */
	
	private String weixingshujuji;
		
	/**
	 * 云量
	 */
	
	private Double yunliang;
		
	/**
	 * 分辨率
	 */
	
	private Integer fenbianlv;
		
	/**
	 * 地区
	 */
	
	private String diqu;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 部门账号
	 */
	
	private String bumenzhanghao;
		
	/**
	 * 管理员姓名
	 */
	
	private String guanliyuanxingming;
		
	/**
	 * 影像资料
	 */
	
	private String yingxiangziliao;
		
	/**
	 * 详情介绍
	 */
	
	private String xiangqingjieshao;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：影像分类
	 */
	 
	public void setYingxiangfenlei(String yingxiangfenlei) {
		this.yingxiangfenlei = yingxiangfenlei;
	}
	
	/**
	 * 获取：影像分类
	 */
	public String getYingxiangfenlei() {
		return yingxiangfenlei;
	}
				
	
	/**
	 * 设置：卫星数据集
	 */
	 
	public void setWeixingshujuji(String weixingshujuji) {
		this.weixingshujuji = weixingshujuji;
	}
	
	/**
	 * 获取：卫星数据集
	 */
	public String getWeixingshujuji() {
		return weixingshujuji;
	}
				
	
	/**
	 * 设置：云量
	 */
	 
	public void setYunliang(Double yunliang) {
		this.yunliang = yunliang;
	}
	
	/**
	 * 获取：云量
	 */
	public Double getYunliang() {
		return yunliang;
	}
				
	
	/**
	 * 设置：分辨率
	 */
	 
	public void setFenbianlv(Integer fenbianlv) {
		this.fenbianlv = fenbianlv;
	}
	
	/**
	 * 获取：分辨率
	 */
	public Integer getFenbianlv() {
		return fenbianlv;
	}
				
	
	/**
	 * 设置：地区
	 */
	 
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	
	/**
	 * 获取：地区
	 */
	public String getDiqu() {
		return diqu;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：部门账号
	 */
	 
	public void setBumenzhanghao(String bumenzhanghao) {
		this.bumenzhanghao = bumenzhanghao;
	}
	
	/**
	 * 获取：部门账号
	 */
	public String getBumenzhanghao() {
		return bumenzhanghao;
	}
				
	
	/**
	 * 设置：管理员姓名
	 */
	 
	public void setGuanliyuanxingming(String guanliyuanxingming) {
		this.guanliyuanxingming = guanliyuanxingming;
	}
	
	/**
	 * 获取：管理员姓名
	 */
	public String getGuanliyuanxingming() {
		return guanliyuanxingming;
	}
				
	
	/**
	 * 设置：影像资料
	 */
	 
	public void setYingxiangziliao(String yingxiangziliao) {
		this.yingxiangziliao = yingxiangziliao;
	}
	
	/**
	 * 获取：影像资料
	 */
	public String getYingxiangziliao() {
		return yingxiangziliao;
	}
				
	
	/**
	 * 设置：详情介绍
	 */
	 
	public void setXiangqingjieshao(String xiangqingjieshao) {
		this.xiangqingjieshao = xiangqingjieshao;
	}
	
	/**
	 * 获取：详情介绍
	 */
	public String getXiangqingjieshao() {
		return xiangqingjieshao;
	}
			
}
