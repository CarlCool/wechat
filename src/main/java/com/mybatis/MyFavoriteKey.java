package com.mybatis;

public class MyFavoriteKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PUBLIC.MY_FAVORITES.USER_ID
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PUBLIC.MY_FAVORITES.FAVORITES_ID
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	private Integer favoritesId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PUBLIC.MY_FAVORITES.USER_ID
	 * @return  the value of PUBLIC.MY_FAVORITES.USER_ID
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PUBLIC.MY_FAVORITES.USER_ID
	 * @param userId  the value for PUBLIC.MY_FAVORITES.USER_ID
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PUBLIC.MY_FAVORITES.FAVORITES_ID
	 * @return  the value of PUBLIC.MY_FAVORITES.FAVORITES_ID
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	public Integer getFavoritesId() {
		return favoritesId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PUBLIC.MY_FAVORITES.FAVORITES_ID
	 * @param favoritesId  the value for PUBLIC.MY_FAVORITES.FAVORITES_ID
	 * @mbg.generated  Sun Nov 26 15:15:32 CST 2017
	 */
	public void setFavoritesId(Integer favoritesId) {
		this.favoritesId = favoritesId;
	}
}