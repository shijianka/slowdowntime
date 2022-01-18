-- 1 查询表
    -- 查询当前数据库下所有表的名称
    show tables;
    -- 查询表的结构
    desc test;
-- 2 创建表
# create table test(
#       字段名1 数据类型1，
#       字段名2 数据类型2，
#         ...
#       字段名n 数据类型n
# );
    -- 最后一行末尾不能加逗号
create table test(
    test_name char(4),
    test_age int
);

/**
  * 数据类型
 */
/*
分类	    数据类型	        大小	                    描述
数值类型
        TINYINT	        1 byte	                小整数值
        SMALLINT        2 bytes	                大整数值
        MEDIUMINT       3 bytes	                大整数值
        INT或INTEGER	4 bytes	                大整数值            	                age int
        BIGINT	        8 bytes	                极大整数值
        FLOAT	        4 bytes 	            单精度浮点数值
        DOUBLE	        8 bytes	                双精度浮点数值	            score double(总长度,小数点后保留的位数)  0~100 2
        DECIMAL		                            小数值
日期和时间类型
        DATE	        3	                    日期值	                birthday date
        TIME	        3	                    时间值或持续时间
        YEAR	        1	                    年份值
        DATETIME    	8	                    混合日期和时间值
        TIMESTAMP	    4	                    混合日期和时间值，时间戳	    “张三”
字符串类型
        CHAR	        0-255 bytes	            定长字符串	            name char(10)    10个字符空间     存储的性能高  浪费空间
    	VARCHAR	        0-65535 bytes	        变长字符串	            name varchar(10)   2个字符空间      存储性能低  节约空间
    	TINYBLOB	    0-255 bytes         	不超过 255 个字符的二进制字符串
    	TINYTEXT    	0-255 bytes         	短文本字符串
    	BLOB	        0-65 535 bytes	        二进制形式的长文本数据
    	TEXT	        0-65 535 bytes	        长文本数据
    	MEDIUMBLOB	    0-16 777 215 bytes	    二进制形式的中等长度文本数据
    	MEDIUMTEXT	    0-16 777 215 bytes  	中等长度文本数据
    	LONGBLOB	    0-4 294 967 295 bytes	二进制形式的极大文本数据
    	LONGTEXT	    0-4 294 967 295 bytes	极大文本数据
  */
