-- 修改表
    -- 1 修改表名
    alter table test1 rename to test;
    -- 2 添加一列
    alter table test add name varchar(10);
    -- 3 修改数据类型
    alter table test modify name tinyint ;
    -- 4 修改列名和数据类型
    alter table test change test_age age smallint;
    -- 5 删除列
    alter table test drop name;
