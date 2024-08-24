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

import com.entity.YaoganyingxiangEntity;
import com.entity.view.YaoganyingxiangView;

import com.service.YaoganyingxiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 遥感影像
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
@RestController
@RequestMapping("/yaoganyingxiang")
public class YaoganyingxiangController {
    @Autowired
    private YaoganyingxiangService yaoganyingxiangService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YaoganyingxiangEntity yaoganyingxiang,
                @RequestParam(required = false) Double yunliangstart,
                @RequestParam(required = false) Double yunliangend,
                @RequestParam(required = false) Double fenbianlvstart,
                @RequestParam(required = false) Double fenbianlvend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fabushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fabushijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("bumenguanliyuan")) {
			yaoganyingxiang.setBumenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YaoganyingxiangEntity> ew = new EntityWrapper<YaoganyingxiangEntity>();
                if(yunliangstart!=null) ew.ge("yunliang", yunliangstart);
                if(yunliangend!=null) ew.le("yunliang", yunliangend);
                if(fenbianlvstart!=null) ew.ge("fenbianlv", fenbianlvstart);
                if(fenbianlvend!=null) ew.le("fenbianlv", fenbianlvend);
                if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
                if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);

		PageUtils page = yaoganyingxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaoganyingxiang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YaoganyingxiangEntity yaoganyingxiang, 
                @RequestParam(required = false) Double yunliangstart,
                @RequestParam(required = false) Double yunliangend,
                @RequestParam(required = false) Double fenbianlvstart,
                @RequestParam(required = false) Double fenbianlvend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fabushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date fabushijianend,
		HttpServletRequest request){
        EntityWrapper<YaoganyingxiangEntity> ew = new EntityWrapper<YaoganyingxiangEntity>();
                if(yunliangstart!=null) ew.ge("yunliang", yunliangstart);
                if(yunliangend!=null) ew.le("yunliang", yunliangend);
                if(fenbianlvstart!=null) ew.ge("fenbianlv", fenbianlvstart);
                if(fenbianlvend!=null) ew.le("fenbianlv", fenbianlvend);
                if(fabushijianstart!=null) ew.ge("fabushijian", fabushijianstart);
                if(fabushijianend!=null) ew.le("fabushijian", fabushijianend);

		PageUtils page = yaoganyingxiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yaoganyingxiang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YaoganyingxiangEntity yaoganyingxiang){
       	EntityWrapper<YaoganyingxiangEntity> ew = new EntityWrapper<YaoganyingxiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yaoganyingxiang, "yaoganyingxiang")); 
        return R.ok().put("data", yaoganyingxiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YaoganyingxiangEntity yaoganyingxiang){
        EntityWrapper< YaoganyingxiangEntity> ew = new EntityWrapper< YaoganyingxiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yaoganyingxiang, "yaoganyingxiang")); 
		YaoganyingxiangView yaoganyingxiangView =  yaoganyingxiangService.selectView(ew);
		return R.ok("查询遥感影像成功").put("data", yaoganyingxiangView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YaoganyingxiangEntity yaoganyingxiang = yaoganyingxiangService.selectById(id);
        return R.ok().put("data", yaoganyingxiang);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YaoganyingxiangEntity yaoganyingxiang = yaoganyingxiangService.selectById(id);
        return R.ok().put("data", yaoganyingxiang);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YaoganyingxiangEntity yaoganyingxiang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yaoganyingxiang);
        yaoganyingxiangService.insert(yaoganyingxiang);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YaoganyingxiangEntity yaoganyingxiang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yaoganyingxiang);
        yaoganyingxiangService.insert(yaoganyingxiang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YaoganyingxiangEntity yaoganyingxiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yaoganyingxiang);
        yaoganyingxiangService.updateById(yaoganyingxiang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yaoganyingxiangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
