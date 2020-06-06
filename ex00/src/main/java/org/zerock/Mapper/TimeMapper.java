package org.zerock.Mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate From dual")
	public String getTime();
}
