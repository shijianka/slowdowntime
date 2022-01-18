-- 条件查询
    -- 查询年龄大于等于18且小于25的人的信息
    select *from test where age>=18 and age<25;
    -- 查询年龄不等于18
    select *from test where age!=18;
    select *from test where age<>18;
    -- 查询年龄等于18或者等于25的人的信息
    select *from test where age=18 or age=25;

    #注意，null值不能用 =  ！=  。需要用is  is not
    insert into test values(null,19);
    select *from test;
    alter table test change test_name name varchar(10);

    -- 查询姓名不为null
    select name,age from test where name is  null;
    select name,age from test where name is not null;

    -- 模糊查询
    -- 通配符
        -- _:代表单个任意字符
        -- %:代表任意个数字符
    select *from test where name like "%艳";
    select *from test where name like "小%";
    select *from test where name like "%艳%";