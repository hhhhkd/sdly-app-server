package com.hkd.model.po;

import java.io.Serializable;

public class TpUserRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_user_role.id
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_user_role.userid
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_user_role.roleid
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    private Integer roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_user_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_user_role.id
     *
     * @return the value of tp_user_role.id
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_user_role.id
     *
     * @param id the value for tp_user_role.id
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_user_role.userid
     *
     * @return the value of tp_user_role.userid
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_user_role.userid
     *
     * @param userid the value for tp_user_role.userid
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_user_role.roleid
     *
     * @return the value of tp_user_role.roleid
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_user_role.roleid
     *
     * @param roleid the value for tp_user_role.roleid
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", roleid=").append(roleid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}