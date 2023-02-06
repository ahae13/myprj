package org.greenp.uiexam.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.greenp.uiexam.vo.StudentVO;

@Mapper
public interface IStudentMapper {
	
	public void update(StudentVO student);
	
	//public StudentVO confirm(@Param("sno") int sno, @Param("name") String name);
	public StudentVO confirm(StudentVO student);
	
	public StudentVO loginCheck(@Param("id") String id, @Param("pw") String pw);
	
}
