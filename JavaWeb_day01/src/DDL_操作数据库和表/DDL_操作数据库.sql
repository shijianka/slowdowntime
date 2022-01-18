-- 1 查询
show databases;
-- 2 创建
    -- 创建数据库
    create database test1;
    -- 创建数据库（判断，如果不存在则创建）
    create database if not exists test2;
-- 3 删除
    -- 删除数据库
    drop database test2;
    -- 删除数据库（判断，如果存在则删除）
    drop database if exists test2;
-- 4 使用数据库
    -- 查看当前使用的数据库
    select database();
    -- 使用数据库
    use javaweb;
