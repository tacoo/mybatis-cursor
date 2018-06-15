package example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.session.ResultHandler;

@Mapper
public interface AMapper {

	@Select("SELECT '1'")
	@ResultType(String.class)
	Cursor<String> viaCursor();

	@Select("SELECT '1'")
	@ResultType(String.class)
	void viaResultHander(ResultHandler<String> handler);
}
