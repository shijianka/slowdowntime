-- 查询所有数据
select * from test;
-- 添加数据
    -- 给指定列添加数据
    insert into test (test_name, age) values('小花',18);
    -- 给所有列添加数据，列明列表可以省略不写
    insert into test values('小妹',20);
    -- 批量添加数据
    insert into test(test_name, age) values('刘艳',25),('liuYan',25);
    insert into test values ('*刘艳',25),('*liuYan',25);
