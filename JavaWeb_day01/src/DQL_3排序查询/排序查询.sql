-- 排序方式
    -- 升序 asc
    -- 降序 desc
-- 排序语法 select 字段列表 from 表名 order by 排序字段名1 [排序方式1],排序字段名1 [排序方式1]...;
-- 排序查询 默认升序
select * from test order by age;
-- 排序查询 降序查询
select * from test order by age desc;
