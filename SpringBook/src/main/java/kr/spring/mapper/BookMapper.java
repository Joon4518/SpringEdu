package kr.spring.mapper;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mysql.jdbc.PreparedStatement;

import kr.spring.entity.Board;
import kr.spring.entity.BookVO;

@Mapper // MyBatis가 interface를 찾기위해 달아주는 부분
public interface BookMapper {

	public List<BookVO> getLists(); //게시글 전체보기기능

	public void bookInsert(BookVO book);

	public BookVO bookContent(int num);

	public void bookDelete(int num);

	public void bookUpdate(BookVO vo);

	public void boardCount(int idx);

}












