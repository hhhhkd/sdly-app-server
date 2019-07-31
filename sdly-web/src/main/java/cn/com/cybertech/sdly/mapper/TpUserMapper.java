package cn.com.cybertech.sdly.mapper;

import cn.com.cybertech.sdly.model.po.TpUser;
import cn.com.cybertech.sdly.model.po.TpUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TpUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    long countByExample(TpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    int deleteByExample(TpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    int insert(TpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    int insertSelective(TpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    List<TpUser> selectByExample(TpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    TpUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") TpUser record, @Param("example") TpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    int updateByExample(@Param("record") TpUser record, @Param("example") TpUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    int updateByPrimaryKeySelective(TpUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_user
     *
     * @mbg.generated Tue May 28 15:52:54 CST 2019
     */
    int updateByPrimaryKey(TpUser record);


}