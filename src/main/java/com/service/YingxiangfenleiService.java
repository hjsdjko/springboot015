package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingxiangfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingxiangfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingxiangfenleiView;


/**
 * 影像分类
 *
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
public interface YingxiangfenleiService extends IService<YingxiangfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingxiangfenleiVO> selectListVO(Wrapper<YingxiangfenleiEntity> wrapper);
   	
   	YingxiangfenleiVO selectVO(@Param("ew") Wrapper<YingxiangfenleiEntity> wrapper);
   	
   	List<YingxiangfenleiView> selectListView(Wrapper<YingxiangfenleiEntity> wrapper);
   	
   	YingxiangfenleiView selectView(@Param("ew") Wrapper<YingxiangfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingxiangfenleiEntity> wrapper);

   	

}

