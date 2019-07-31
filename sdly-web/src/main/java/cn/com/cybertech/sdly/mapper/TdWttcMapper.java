package cn.com.cybertech.sdly.mapper;

import cn.com.cybertech.sdly.model.po.TdWttc;
import cn.com.cybertech.sdly.model.po.TdWttcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdWttcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    long countByExample(TdWttcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int deleteByExample(TdWttcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int insert(TdWttc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int insertSelective(TdWttc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    List<TdWttc> selectByExample(TdWttcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    TdWttc selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") TdWttc record, @Param("example") TdWttcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByExample(@Param("record") TdWttc record, @Param("example") TdWttcExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByPrimaryKeySelective(TdWttc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table td_wttc
     *
     * @mbg.generated Mon May 27 16:24:06 CST 2019
     */
    int updateByPrimaryKey(TdWttc record);
}