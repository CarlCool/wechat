package com.mybatis;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public CourseExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("TITLE is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("TITLE is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("TITLE =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("TITLE <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("TITLE >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("TITLE >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("TITLE <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("TITLE <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("TITLE like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("TITLE not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("TITLE in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("TITLE not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("TITLE between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("TITLE not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andDescIsNull() {
			addCriterion("DESC is null");
			return (Criteria) this;
		}

		public Criteria andDescIsNotNull() {
			addCriterion("DESC is not null");
			return (Criteria) this;
		}

		public Criteria andDescEqualTo(String value) {
			addCriterion("DESC =", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescNotEqualTo(String value) {
			addCriterion("DESC <>", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescGreaterThan(String value) {
			addCriterion("DESC >", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescGreaterThanOrEqualTo(String value) {
			addCriterion("DESC >=", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescLessThan(String value) {
			addCriterion("DESC <", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescLessThanOrEqualTo(String value) {
			addCriterion("DESC <=", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescLike(String value) {
			addCriterion("DESC like", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescNotLike(String value) {
			addCriterion("DESC not like", value, "desc");
			return (Criteria) this;
		}

		public Criteria andDescIn(List<String> values) {
			addCriterion("DESC in", values, "desc");
			return (Criteria) this;
		}

		public Criteria andDescNotIn(List<String> values) {
			addCriterion("DESC not in", values, "desc");
			return (Criteria) this;
		}

		public Criteria andDescBetween(String value1, String value2) {
			addCriterion("DESC between", value1, value2, "desc");
			return (Criteria) this;
		}

		public Criteria andDescNotBetween(String value1, String value2) {
			addCriterion("DESC not between", value1, value2, "desc");
			return (Criteria) this;
		}

		public Criteria andMemoIsNull() {
			addCriterion("MEMO is null");
			return (Criteria) this;
		}

		public Criteria andMemoIsNotNull() {
			addCriterion("MEMO is not null");
			return (Criteria) this;
		}

		public Criteria andMemoEqualTo(String value) {
			addCriterion("MEMO =", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotEqualTo(String value) {
			addCriterion("MEMO <>", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoGreaterThan(String value) {
			addCriterion("MEMO >", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoGreaterThanOrEqualTo(String value) {
			addCriterion("MEMO >=", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLessThan(String value) {
			addCriterion("MEMO <", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLessThanOrEqualTo(String value) {
			addCriterion("MEMO <=", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoLike(String value) {
			addCriterion("MEMO like", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotLike(String value) {
			addCriterion("MEMO not like", value, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoIn(List<String> values) {
			addCriterion("MEMO in", values, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotIn(List<String> values) {
			addCriterion("MEMO not in", values, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoBetween(String value1, String value2) {
			addCriterion("MEMO between", value1, value2, "memo");
			return (Criteria) this;
		}

		public Criteria andMemoNotBetween(String value1, String value2) {
			addCriterion("MEMO not between", value1, value2, "memo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PUBLIC.COURSES
	 * @mbg.generated  Fri Nov 24 16:52:28 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PUBLIC.COURSES
     *
     * @mbg.generated do_not_delete_during_merge Mon Nov 20 10:00:46 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}