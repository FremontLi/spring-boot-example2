package com.spring.boot.example.springbootmybatis;

import com.google.gson.Gson;
import com.spring.boot.example.springbootmybatis.dao.Sci_News;
import com.spring.boot.example.springbootmybatis.mapper.Sci_NewsMapper;
import com.spring.boot.example.springbootmybatis.dao.Sys_User;
import com.spring.boot.example.springbootmybatis.mapper.Sys_UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@SpringBootTest
//使其运行在spring环境中进行测试.
//@RunWith如果没有，需要添加Junit依赖，解决方法参考下述
@RunWith(SpringJUnit4ClassRunner.class)
class SpringBootMybatisApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private Sci_NewsMapper sci_newsMapper;

    @Autowired
    private Sys_UserMapper sys_userMapper;

    //    @Test
//    void contextLoads() throws SQLException {
//        Connection connection = dataSource.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from user");
//
//        while(resultSet.next()){
//            int id = resultSet.getInt(1);
//            String name = resultSet.getString(2);
//            String address = resultSet.getString(3);
//            System.out.println("id:" + id + " name:" + name + " address:" + address);
//        }
//    }
/*
    @Test void testSci_NewsMapper(){
        Sci_News sci_newsById = sci_newsMapper.getSci_NewsById("1");
        System.out.println(sci_newsById.getId() + " " + sci_newsById.getTitle() + " " + sci_newsById.getType() + " " + sci_newsById.getUser_id() + " " + sci_newsById.getLink() + " " + sci_newsById.getCover() + " "+ sci_newsById.getDownloads()+ " " + sci_newsById.getGmt_create()+ " " + sci_newsById.getCreate_by() + " " + sci_newsById.getGmt_update()+ " " + sci_newsById.getUpdate_by());
    }

}
*/
/*
    @Test void testSys_UserMapper(){
        Sys_User sys_userById = sys_userMapper.getSys_UserById("1");
        System.out.println(sys_userById.getId() + " " + sys_userById.getNickname() + " " + sys_userById.getPhone() + " " + sys_userById.getEmail() + " " + sys_userById.getPassword() + " " + sys_userById.getSalt() + " "+ sys_userById.getGmt_create()+ " " + sys_userById.getGmt_update());
    }

 */
    @Test
    void testMapper() {
        Sci_News sci_newsById = sci_newsMapper.getSci_NewsById("1");
        Gson gson = new Gson();
        System.out.println(gson.toJson(sci_newsById, Sci_News.class));
        //System.out.println(sci_newsById.getId() + " " + sci_newsById.getTitle() + " " + sci_newsById.getType() + " " + sci_newsById.getUser_id() + " " + sci_newsById.getLink() + " " + sci_newsById.getCover() + " " + sci_newsById.getDownloads() + " " + sci_newsById.getGmt_create() + " " + sci_newsById.getCreate_by() + " " + sci_newsById.getGmt_update() + " " + sci_newsById.getUpdate_by()+ " " +sci_newsById.getUser().getNickname());
    }
}