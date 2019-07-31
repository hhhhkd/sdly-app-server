package cn.com.cybertech.sdly.mapper;

import cn.com.cybertech.sdly.model.po.TpDepart;
import cn.com.cybertech.sdly.model.po.TpDepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpDepartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    long countByExample(TpDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int deleteByExample(TpDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int deleteByPrimaryKey(String jgbm);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int insert(TpDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int insertSelective(TpDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    List<TpDepart> selectByExample(TpDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    TpDepart selectByPrimaryKey(String jgbm);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") TpDepart record, @Param("example") TpDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByExample(@Param("record") TpDepart record, @Param("example") TpDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByPrimaryKeySelective(TpDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_depart
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByPrimaryKey(TpDepart record);
}