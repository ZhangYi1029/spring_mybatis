package org.com.yi.spring_mybatis.relationmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.com.yi.spring_mybatis.relationmag.beans.HusbandBean;

public interface HusbandMapper {

	public int marry(@Param("hus")HusbandBean hus);

	public int divorce(@Param("hus")HusbandBean hus);

}
