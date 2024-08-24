package com.entity.view;

import com.entity.YingxiangfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 影像分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
@TableName("yingxiangfenlei")
public class YingxiangfenleiView  extends YingxiangfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingxiangfenleiView(){
	}
 
 	public YingxiangfenleiView(YingxiangfenleiEntity yingxiangfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yingxiangfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
