package com.mybatis.cli;

import com.mybatis.Course;
import com.mybatis.CourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	long countByExample(CourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int deleteByExample(CourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int insert(Course record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int insertSelective(Course record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	List<Course> selectByExample(CourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	Course selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int updateByPrimaryKeySelective(Course record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int updateByPrimaryKey(Course record);
}