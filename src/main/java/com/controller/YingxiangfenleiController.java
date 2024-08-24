package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YingxiangfenleiEntity;
import com.entity.view.YingxiangfenleiView;

import com.service.YingxiangfenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 影像分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
@RestController
@RequestMapping("/yingxiangfenlei")
public class YingxiangfenleiController {
    @Autowired
    private YingxiangfenleiService yingxiangfenleiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YingxiangfenleiEntity yingxiangfenlei,
		HttpServletRequest request){
        EntityWrapper<YingxiangfenleiEntity> ew = new EntityWrapper<YingxiangfenleiEntity>();

		PageUtils page = yingxiangfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingxiangfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YingxiangfenleiEntity yingxiangfenlei, 
		HttpServletRequest request){
        EntityWrapper<YingxiangfenleiEntity> ew = new EntityWrapper<YingxiangfenleiEntity>();

		PageUtils page = yingxiangfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingxiangfenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YingxiangfenleiEntity yingxiangfenlei){
       	EntityWrapper<YingxiangfenleiEntity> ew = new EntityWrapper<YingxiangfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yingxiangfenlei, "yingxiangfenlei")); 
        return R.ok().put("data", yingxiangfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YingxiangfenleiEntity yingxiangfenlei){
        EntityWrapper< YingxiangfenleiEntity> ew = new EntityWrapper< YingxiangfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yingxiangfenlei, "yingxiangfenlei")); 
		YingxiangfenleiView yingxiangfenleiView =  yingxiangfenleiService.selectView(ew);
		return R.ok("查询影像分类成功").put("data", yingxiangfenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YingxiangfenleiEntity yingxiangfenlei = yingxiangfenleiService.selectById(id);
        return R.ok().put("data", yingxiangfenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YingxiangfenleiEntity yingxiangfenlei = yingxiangfenleiService.selectById(id);
        return R.ok().put("data", yingxiangfenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YingxiangfenleiEntity yingxiangfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yingxiangfenlei);
        yingxiangfenleiService.insert(yingxiangfenlei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YingxiangfenleiEntity yingxiangfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yingxiangfenlei);
        yingxiangfenleiService.insert(yingxiangfenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YingxiangfenleiEntity yingxiangfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yingxiangfenlei);
        yingxiangfenleiService.updateById(yingxiangfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yingxiangfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
