# spring-boot-example2 说明
使用SpringBoot+Mybatis，通过user_Id实现跨表关系的查询<br>
<code>
    <!--关系映射设置-->
    <resultMap id="map01" type="com.spring.boot.example.springbootmybatis.dao.Sci_News">
        <id property="id" column="id"/>
        <result property="title" column="title"/>
        <result property="type" column="type"/>
        <result property="user_id" column="user_id"/>
        <result property="link" column="cover"/>
        <result property="downloads" column="downloads"/>
        <result property="gmt_create" column="gmt_create"/>
        <result property="create_by" column="create_by"/>
        <result property="gmt_update" column="gmt_update"/>
        <result property="update_by" column="update_by"/>
        <association property="user" javaType="com.spring.boot.example.springbootmybatis.dao.Sys_User">
            <id property="id" column="id"/>
            <result property="nickname" column="nickname"/>
            <result property="email" column="email"/>
            <result property="phone" column="phone"/>
        </association>
    </resultMap>
<code>
## 新闻类Sci_News
private String id;<br>
private String title;<br>
private String type;<br>
private String user_id;<br>
private String link;<br>
private String cover;<br>
private Integer downloads;<br>
private Timestamp gmt_create;<br>
private String create_by;<br>
private Timestamp gmt_update;<br>
private String update_by;<br>
private Sys_User user;//增加一个user属性<br>
## 用户类Sys_User
private String id;<br>
private String nickname;<br>
private String phone;<br>
private String email;<br>
private String password;<br>
private String salt;<br>
private Timestamp gmt_create;<br>
private Timestamp gmt_update;<br>
## 数据库两张表内容如下
sci_news新闻表：<br>
  `id` varchar(32) NOT NULL  COMMENT '新闻ID',<br>
  `title` varchar(255) NOT NULL  COMMENT '新闻标题',<br>
  `type` varchar(24) NOT NULL  COMMENT '新闻类型',<br>
  `user_id` varchar(32) NOT NULL  COMMENT '作者ID',<br>
  `link` varchar(255) COMMENT '新闻链接',<br>
  `cover` varchar(255) NOT NULL  COMMENT '新闻封面链接',<br>
  `downloads` Integer(0) NOT NULL  COMMENT '下载量',<br>
  `gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',<br>
  `create_by` varchar(24) NOT NULL  COMMENT '创建操作人',<br>
  `gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',<br>
  `update_by` varchar(24) NOT NULL  COMMENT '更新操作人',<br>
  PRIMARY KEY (`id`), <br>
  UNIQUE KEY `news_title_index` (`title`)<br>
<br>
sys_user用户表：<br>
`id` varchar(32) NOT NULL  COMMENT '用户ID<br>
`nickname` varchar(255) NOT NULL  COMMENT '昵称',<br>
`phone` varchar(32) NOT NULL  COMMENT '手机号',<br>
`email` varchar(255) NOT NULL  COMMENT '邮箱',<br>
`password` varchar(32) COMMENT '密码',<br>
`salt` varchar(32) COMMENT '盐值',<br>
`gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',<br>
`gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',<br>
PRIMARY KEY (`id`), <br>
UNIQUE KEY `nickname_index` (`nickname`),<br>
UNIQUE KEY `email_index` (`email`),<br>
UNIQUE KEY `phone_index` (`phone`)<br>
