package t1;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：MyBatis_choose_when_and_otherwise
 * Package(包名): t1
 * Class(测试类名): SiteMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/13
 * Time(创建时间)： 21:28
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

class SiteMapperTest
{

    @Test
    void update() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Site site = new Site();
        site.setId(7);
        site.setAge(13);
        site.setCountry("cn");

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        int i = siteMapper.update(site);
        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    void updateByParam() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        Site site = new Site();
//        site.setId(7);
//        site.setAge(13);
//        site.setCountry("cn");

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        int i = siteMapper.updateByParam(7, null, null, 12, null, new Date());
        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    void select() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Site site = new Site();
        //site.setId(7);
        //site.setAge(13);
        site.setCountry("CN");

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        List<Site> list = siteMapper.select(site);
        System.out.println(list);

        //sqlSession.commit();
        sqlSession.close();
    }

    @Test
    void selectByParam() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        Site site = new Site();
//        //site.setId(7);
//        //site.setAge(13);
//        site.setCountry("CN");

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        List<Site> list = siteMapper.selectByParam(null, null, null, 12, null, null);
        System.out.println(list);

        //sqlSession.commit();
        sqlSession.close();
    }

    @Test
    void selectWebsite() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Site site = new Site();
        //site.setId(7);
        site.setName("百");
        //site.setAge(13);
        //site.setCountry("CN");

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        List<Site> list = siteMapper.selectWebsite(site);
        System.out.println(list);

        //sqlSession.commit();
        sqlSession.close();
    }

    @Test
    void selectWebsiteByParam() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();


        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        List<Site> list = siteMapper.selectWebsiteByParam(null, "百", null, null, null, null);
        System.out.println(list);

        //sqlSession.commit();
        sqlSession.close();
    }
}