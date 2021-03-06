package com.mybatis.cli;

import com.mybatis.Course;
import com.mybatis.CourseSchedule;
import com.mybatis.CourseScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseScheduleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	long countByExample(CourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	int deleteByExample(CourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	int insert(CourseSchedule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	int insertSelective(CourseSchedule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	List<CourseSchedule> selectByExample(CourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	CourseSchedule selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	int updateByExampleSelective(@Param("record") CourseSchedule record,
			@Param("example") CourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	int updateByExample(@Param("record") CourseSchedule record, @Param("example") CourseScheduleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	int updateByPrimaryKeySelective(CourseSchedule record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSE_SCHEDULE
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	int updateByPrimaryKey(CourseSchedule record);
	
	  List<CourseSchedule> selectAllScheduledCourses();
	   
	  CourseSchedule selectByCourseScheduleId(Integer id);
}