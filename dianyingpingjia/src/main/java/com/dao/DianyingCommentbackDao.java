package com.dao;

import com.entity.DianyingCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingCommentbackView;

/**
 * 电影评论 Dao 接口
 *
 * @author 
 * @since 2021-04-05
 */
public interface DianyingCommentbackDao extends BaseMapper<DianyingCommentbackEntity> {

   List<DianyingCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);


}
