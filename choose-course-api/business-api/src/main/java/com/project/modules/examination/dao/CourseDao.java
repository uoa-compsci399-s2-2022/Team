package com.project.modules.examination.dao;

import com.project.common.dao.BaseDao;
import com.project.modules.examination.dto.CourseDTO;
import com.project.modules.examination.dto.UserCourseDTO;
import com.project.modules.examination.entity.CourseEntity;
import com.project.modules.examination.entity.UserCourseEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 *
 *
 *
 */
@Mapper
public interface CourseDao extends BaseDao<CourseEntity> {
    List<CourseDTO> getCourseByMajor(CourseEntity courseEntity);

}