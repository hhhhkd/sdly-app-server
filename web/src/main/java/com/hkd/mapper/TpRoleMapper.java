package com.hkd.mapper;

import com.hkd.model.po.TpRole;
import com.hkd.model.po.TpRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TpRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    long countByExample(TpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int deleteByExample(TpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int insert(TpRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int insertSelective(TpRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    List<TpRole> selectByExample(TpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    TpRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") TpRole record, @Param("example") TpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByExample(@Param("record") TpRole record, @Param("example") TpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByPrimaryKeySelective(TpRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_role
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByPrimaryKey(TpRole record);
}