package kr.spring.mapper;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import kr.spring.entity.Board;
import kr.spring.service.BoardServiceImpl;
import lombok.extern.log4j.Log4j;

@Log4j // 테스트 실행결과를 콘솔창에 나오게 하기위함
@RunWith(SpringJUnit4ClassRunner.class) // 실행하기위해 스프링컨테이너에 올리는 코드
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
// root-context.xml 경로를 잡아주는 과정
@WebAppConfiguration // Servlet 컨테이너를 사용하기 위한 어노테이션
public class DataSourceTest {
	// root-context.xml이 이상없는지
	// test하는 클래스
	
	// Connection이 잘되는지 테스트
	@Autowired // root-context.xml에 있는 id가 dataSource인 녀석을 사용하겠다
	private DataSource dataSource;
	
	@Autowired
	private BoardServiceImpl service;
	
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private WebApplicationContext ctx; // Spring Container 
	
	
	private MockMvc mockMvc; // 가상의 MVC환경 만들어주는 객체, 뷰, 핸들러, 맵핑 등등 실행해줌
	
	@Before // Test실행하기 전에 먼저 실행하는 부분
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
//	@Test
//	public void testInsert() {
//		Board vo = new Board();
//		vo.setMemID("aischool");
//		vo.setTitle("다음 주 화요일부터 너무 즐거운 코딩페스티벌 시작됩니다.");
//		vo.setContent("1등 상금 15만원 (팀별 지급) 열심히하세요! 모두가 열심히해야 점수가 쌓입니다.");
//		vo.setWriter("교육운영부");
//		mapper.insertSelectKey(vo);
//	}
	
	@Test
	public void testController() throws Exception{
		
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/modify?idx=3")) // perform -> 요청하다
				.andReturn() // return 값을 받아오겠다.
				.getModelAndView() // controller의 model 값과 view경로를 다 받아오겠다.
				);
		
	}
	
	// service 클래스 안에 getList가 잘 되는지 테스트해보시오

//	@Test
//	public void testService() {
//		List<Board> list = service.getList();
//			for(Board vo : list) {
//			System.out.println(vo.toString());
//		}
//	}
//	
//	
//	@Test
//	public void testGetList() {
//		List<Board> list = mapper.getList();
//		for(Board vo : list) {
//			System.out.println(vo.toString());
//		}
//		
//	}
	
//	@Test
//	public void testConnection() {
//		
//		try(Connection conn = dataSource.getConnection()){
//			log.info(conn);
//		}catch(Exception e) {
//			
//		}
//	} 
//	
	
	
	
	
}
