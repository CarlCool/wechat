package com.mybatis;

public class Credit {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PUBLIC.CREDITS.ID
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PUBLIC.CREDITS.AMOUNT
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	private Integer amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PUBLIC.CREDITS.USERS_OPEN_ID
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	private String usersOpenId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PUBLIC.CREDITS.ID
	 * @return  the value of PUBLIC.CREDITS.ID
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PUBLIC.CREDITS.ID
	 * @param id  the value for PUBLIC.CREDITS.ID
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PUBLIC.CREDITS.AMOUNT
	 * @return  the value of PUBLIC.CREDITS.AMOUNT
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	public Integer getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PUBLIC.CREDITS.AMOUNT
	 * @param amount  the value for PUBLIC.CREDITS.AMOUNT
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PUBLIC.CREDITS.USERS_OPEN_ID
	 * @return  the value of PUBLIC.CREDITS.USERS_OPEN_ID
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	public String getUsersOpenId() {
		return usersOpenId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PUBLIC.CREDITS.USERS_OPEN_ID
	 * @param usersOpenId  the value for PUBLIC.CREDITS.USERS_OPEN_ID
	 * @mbg.generated  Fri Nov 24 13:12:07 CST 2017
	 */
	public void setUsersOpenId(String usersOpenId) {
		this.usersOpenId = usersOpenId;
	}
}