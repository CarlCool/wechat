package com.mybatis;

public class Favorite {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PUBLIC.FAVORITES.ID
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PUBLIC.FAVORITES.DESCRIPTION
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PUBLIC.FAVORITES.ICONURL
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	private String iconurl;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PUBLIC.FAVORITES.ID
	 * @return  the value of PUBLIC.FAVORITES.ID
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PUBLIC.FAVORITES.ID
	 * @param id  the value for PUBLIC.FAVORITES.ID
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PUBLIC.FAVORITES.DESCRIPTION
	 * @return  the value of PUBLIC.FAVORITES.DESCRIPTION
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PUBLIC.FAVORITES.DESCRIPTION
	 * @param description  the value for PUBLIC.FAVORITES.DESCRIPTION
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PUBLIC.FAVORITES.ICONURL
	 * @return  the value of PUBLIC.FAVORITES.ICONURL
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	public String getIconurl() {
		return iconurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PUBLIC.FAVORITES.ICONURL
	 * @param iconurl  the value for PUBLIC.FAVORITES.ICONURL
	 * @mbg.generated  Tue Nov 28 12:49:57 CST 2017
	 */
	public void setIconurl(String iconurl) {
		this.iconurl = iconurl;
	}
}