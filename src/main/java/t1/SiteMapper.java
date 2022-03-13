package t1;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Project name(项目名称)：MyBatis_if
 * Package(包名): t1
 * Interface(接口名): SiteMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/13
 * Time(创建时间)： 20:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface SiteMapper
{
    public int update(@Param("site") Site site);

    public int updateByParam(@Param("id") Integer id, @Param("name") String name, @Param("url") String url,
                             @Param("age") Integer age, @Param("country") String country, @Param("createTime") Date createTime);

    public List<Site> select(@Param("site") Site site);

    public List<Site> selectByParam(@Param("id") Integer id, @Param("name") String name, @Param("url") String url,
                             @Param("age") Integer age, @Param("country") String country, @Param("createTime") Date createTime);




}
