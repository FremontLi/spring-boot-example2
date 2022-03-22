## spring-boot-example2 文件说明
使用SpringBoot+Mybatis，通过user_Id实现跨表关系的查询
## 数据库两张表内容如下
# 新闻类
sci_news表：
  `id` varchar(32) NOT NULL  COMMENT '新闻ID',
  `title` varchar(255) NOT NULL  COMMENT '新闻标题',
  `type` varchar(24) NOT NULL  COMMENT '新闻类型',
  `user_id` varchar(32) NOT NULL  COMMENT '作者ID',
  `link` varchar(255) COMMENT '新闻链接',
  `cover` varchar(255) NOT NULL  COMMENT '新闻封面链接',
  `downloads` Integer(0) NOT NULL  COMMENT '下载量',
  `gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',
  `create_by` varchar(24) NOT NULL  COMMENT '创建操作人',
  `gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `update_by` varchar(24) NOT NULL  COMMENT '更新操作人',
  PRIMARY KEY (`id`), 
  UNIQUE KEY `news_title_index` (`title`)
# 用户类
sys_user表：
`id` varchar(32) NOT NULL  COMMENT '用户ID',
`nickname` varchar(255) NOT NULL  COMMENT '昵称',
`phone` varchar(32) NOT NULL  COMMENT '手机号',
`email` varchar(255) NOT NULL  COMMENT '邮箱',
`password` varchar(32) COMMENT '密码',
`salt` varchar(32) COMMENT '盐值',
`gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',
`gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
PRIMARY KEY (`id`), 
UNIQUE KEY `nickname_index` (`nickname`),
UNIQUE KEY `email_index` (`email`),
UNIQUE KEY `phone_index` (`phone`)
`id` varchar(32) NOT NULL  COMMENT '用户ID',`nickname` varchar(255) NOT NULL  COMMENT '昵称',  `phone` varchar(32) NOT NULL  COMMENT '手机号',  `email` varchar(255) NOT NULL  COMMENT '邮箱',  `password` varchar(32) COMMENT '密码',  `salt` varchar(32) COMMENT '盐值',  `gmt_create` timestamp(0) NOT NULL  DEFAULT current_timestamp() COMMENT '创建时间',  `gmt_update` timestamp(0) NOT NULL  DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',  PRIMARY KEY (`id`),   UNIQUE KEY `nickname_index` (`nickname`),UNIQUE KEY `email_index` (`email`),UNIQUE KEY `phone_index` (`phone`)
