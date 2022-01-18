# 语法
    -- select 字段列表 from 表名 [where 分组前条件限定] group by 分组字段名 [having 分组后条件过滤];
    alter table test add sex char(1);
select *from test;
# insert into test (sex) values ("女"),("男");
# delete from test where name is null;
# update test set sex='女';
select sex,sum(age) from test group by sex;
select sex,max(age) from test group by sex;
# select name,max(age) from test group by name;
select sex,count(*),avg(age) from test group by sex;

-- 年龄大于等于25不参与分组
select sex,count(*),avg(age) from test where age<25 group by sex;
-- 年龄大于等于25不参与分组, 分组之后人数大于1
select sex,count(*),avg(age) from test where age<25 group by sex having count(*)>1;