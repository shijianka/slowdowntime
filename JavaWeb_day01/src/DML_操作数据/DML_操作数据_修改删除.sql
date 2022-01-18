-- 修改数据 update 表名 set 列名1=值1，列明2=值2... [where 条件];
    -- 将刘艳的年龄改为18
    update test set age=18 where test_name='刘艳';
        select *from test;
#     如果没有where条件则会将表中所有数据修改
-- 删除 delete from 表明 [where 条件]；
-- 删除张三记录
delete from test where test_name='*liuyan';