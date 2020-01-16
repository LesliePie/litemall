package org.linlinjava.litemall.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class UserExtend {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_extend.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_extend.recommond_user_id
     *
     * @mbg.generated
     */
    private Long recommondUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_extend.recommond_user_name
     *
     * @mbg.generated
     */
    private String recommondUserName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_extend.remain_withdraw_time
     *
     * @mbg.generated
     */
    private Integer remainWithdrawTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_extend.withdraw_money
     *
     * @mbg.generated
     */
    private Long withdrawMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_extend.extend
     *
     * @mbg.generated
     */
    private String extend;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_extend.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_extend.id
     *
     * @return the value of user_extend.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_extend.id
     *
     * @param id the value for user_extend.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_extend.recommond_user_id
     *
     * @return the value of user_extend.recommond_user_id
     *
     * @mbg.generated
     */
    public Long getRecommondUserId() {
        return recommondUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_extend.recommond_user_id
     *
     * @param recommondUserId the value for user_extend.recommond_user_id
     *
     * @mbg.generated
     */
    public void setRecommondUserId(Long recommondUserId) {
        this.recommondUserId = recommondUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_extend.recommond_user_name
     *
     * @return the value of user_extend.recommond_user_name
     *
     * @mbg.generated
     */
    public String getRecommondUserName() {
        return recommondUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_extend.recommond_user_name
     *
     * @param recommondUserName the value for user_extend.recommond_user_name
     *
     * @mbg.generated
     */
    public void setRecommondUserName(String recommondUserName) {
        this.recommondUserName = recommondUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_extend.remain_withdraw_time
     *
     * @return the value of user_extend.remain_withdraw_time
     *
     * @mbg.generated
     */
    public Integer getRemainWithdrawTime() {
        return remainWithdrawTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_extend.remain_withdraw_time
     *
     * @param remainWithdrawTime the value for user_extend.remain_withdraw_time
     *
     * @mbg.generated
     */
    public void setRemainWithdrawTime(Integer remainWithdrawTime) {
        this.remainWithdrawTime = remainWithdrawTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_extend.withdraw_money
     *
     * @return the value of user_extend.withdraw_money
     *
     * @mbg.generated
     */
    public Long getWithdrawMoney() {
        return withdrawMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_extend.withdraw_money
     *
     * @param withdrawMoney the value for user_extend.withdraw_money
     *
     * @mbg.generated
     */
    public void setWithdrawMoney(Long withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_extend.extend
     *
     * @return the value of user_extend.extend
     *
     * @mbg.generated
     */
    public String getExtend() {
        return extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_extend.extend
     *
     * @param extend the value for user_extend.extend
     *
     * @mbg.generated
     */
    public void setExtend(String extend) {
        this.extend = extend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_extend.user_id
     *
     * @return the value of user_extend.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_extend.user_id
     *
     * @param userId the value for user_extend.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_extend
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", recommondUserId=").append(recommondUserId);
        sb.append(", recommondUserName=").append(recommondUserName);
        sb.append(", remainWithdrawTime=").append(remainWithdrawTime);
        sb.append(", withdrawMoney=").append(withdrawMoney);
        sb.append(", extend=").append(extend);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_extend
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserExtend other = (UserExtend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRecommondUserId() == null ? other.getRecommondUserId() == null : this.getRecommondUserId().equals(other.getRecommondUserId()))
            && (this.getRecommondUserName() == null ? other.getRecommondUserName() == null : this.getRecommondUserName().equals(other.getRecommondUserName()))
            && (this.getRemainWithdrawTime() == null ? other.getRemainWithdrawTime() == null : this.getRemainWithdrawTime().equals(other.getRemainWithdrawTime()))
            && (this.getWithdrawMoney() == null ? other.getWithdrawMoney() == null : this.getWithdrawMoney().equals(other.getWithdrawMoney()))
            && (this.getExtend() == null ? other.getExtend() == null : this.getExtend().equals(other.getExtend()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_extend
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRecommondUserId() == null) ? 0 : getRecommondUserId().hashCode());
        result = prime * result + ((getRecommondUserName() == null) ? 0 : getRecommondUserName().hashCode());
        result = prime * result + ((getRemainWithdrawTime() == null) ? 0 : getRemainWithdrawTime().hashCode());
        result = prime * result + ((getWithdrawMoney() == null) ? 0 : getWithdrawMoney().hashCode());
        result = prime * result + ((getExtend() == null) ? 0 : getExtend().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table user_extend
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        recommondUserId("recommond_user_id", "recommondUserId", "BIGINT", false),
        recommondUserName("recommond_user_name", "recommondUserName", "VARCHAR", false),
        remainWithdrawTime("remain_withdraw_time", "remainWithdrawTime", "INTEGER", false),
        withdrawMoney("withdraw_money", "withdrawMoney", "BIGINT", false),
        extend("extend", "extend", "VARCHAR", false),
        userId("user_id", "userId", "BIGINT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table user_extend
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}