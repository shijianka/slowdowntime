# 非空  not null
# 唯一  unique
# 主键  primary key
# 检查  check(MYSQL不支持)
# 默认  default
# 外键  foreign key

# 外键约束
    -- 添加约束
        -- 创建表时添加约束
        create table 表名{
            列名 数据类型,
            ...
            [constraint] [外键名称] foreign key(外键列名) references 主表（主列名）
            };
        -- 建完表后添加约束
        alter table 表名 add constraint 外键名称 foreign key (外键列名)references 主表（主列名）
    -- 删除约束
    alter table 表名 drop  foreign key  外键名称;
