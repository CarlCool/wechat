package com.mybatis.cli;

import com.mybatis.User;
import com.mybatis.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	long countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	User selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.USERS
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	int updateByPrimaryKey(User record);

	User selectByOpenId(String openId);
}