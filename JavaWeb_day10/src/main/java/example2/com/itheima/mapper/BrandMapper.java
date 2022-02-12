package example2.com.itheima.mapper;

import example2.com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BrandMapper {
    //所有
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();

    //添加
    @Insert("insert into tb_brand value(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);


}
