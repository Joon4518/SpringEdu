package kr.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.spring.entity.Member;
import kr.spring.mapper.MemberMapper;

@Controller
public class MemberController {
	
	@Autowired
	private MemberMapper mapper;

	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "member/joinForm";
	}
	
	@RequestMapping("/registerCheck.do")
	public @ResponseBody int registerCheck(@RequestParam("memID") String memID) {
		
		Member m = mapper.registerCheck(memID);
		// m == null -> 아이디 사용가능
		// m != null -> 아이디 사용 불가능
		if( m != null || memID.equals("")) {
			return 0;
		}else{
			return 1;
		}
		
	}
	
	@RequestMapping("/join.do")
	public String join(Member m,RedirectAttributes rttr, HttpSession session) {
		System.out.println("회원가입 기능요청");
		
		// 유효성 검사
		if(m.getMemID() == null || m.getMemID().equals("")||
				m.getMemPassword() == null || m.getMemPassword().equals("") ||
				m.getMemName() == null || m.getMemName().equals("") ||
				m.getMemAge() == 0 ||
				m.getMemEmail() == null || m.getMemEmail().equals("")) {
			// 회원가입을 할 수 없다. 하나라도 누락되어 있기 때문에
			
			// 실패시 joinForm.do로 msgType과 msg 내용을 보내야함
			// msgType : 실패메세지, msg : 모든 내용을 입력하세요
			// RedirectAttributes - 리다이렉트 방식으로 이동할때 보넬 데이터를 저장하는 객체
			
			rttr.addFlashAttribute("msgType","실패메세지");
			rttr.addFlashAttribute("msg","모든 내용을 입력하세요");
			
			return "redirect:/joinForm.do";
		}else {
			// 회원가입을 시도할 수 있는 부분
			m.setMemProfile("");
			int cnt = mapper.join(m);
			
			if(cnt == 1) {
				System.out.println("회원가입 성공!");
				rttr.addFlashAttribute("msgType","성공메세지");
				rttr.addFlashAttribute("msg","회원가입에 성공했습니다.");
				// 회원가입 성공 시 로그인 처리까지 시키기
				session.setAttribute("mvo", m);
				
				return "redirect:/";
			}else {
				System.out.println("회원가입 실패...");
				rttr.addFlashAttribute("msgType","실패메세지");
				rttr.addFlashAttribute("msg","회원가입에 실패했습니다.");
					
				return "redirect:/joinForm.do";
			}
			// 회원가입 후 index.jsp로 이동시키시오
		}
		
	}
	
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping("/login.do")
	public String login(Member m,RedirectAttributes rttr, HttpSession session) {
		
		// 문제.
		// mapper에 login이라는 메소드 이름으로 로그인 기능을 수행하시오
		// 로그인 성공 시 -> index.jsp 이동 후 로그인에 성공했습니다. modal창 띄우기
		// 로그인 실패 시 -> login.jsp 이동 후 로그인에 실패했습니다. modal창 띄우기
		
		Member mvo = mapper.login(m);
		if(mvo != null) {
			System.out.println("로그인 성공!");
			rttr.addFlashAttribute("msgType","성공메세지");
			rttr.addFlashAttribute("msg","로그인에 성공했습니다.");
			// 회원가입 성공 시 로그인 처리까지 시키기
			session.setAttribute("mvo", mvo);
			
			return "redirect:/";
		}else {
			System.out.println("로그인 실패...");
			rttr.addFlashAttribute("msgType","실패메세지");
			rttr.addFlashAttribute("msg","로그인에 실패했습니다.");
				
			return "redirect:/loginForm.do";
		}
	}
	
	@RequestMapping("/updateForm.do")
	public String updateForm() {
		return "member/updateForm";
	}
	
	@RequestMapping("/update.do")
	public String update(Member m,RedirectAttributes rttr, HttpSession session){
		
		m.setMemProfile("");
		
		// 문제.
		// mapper의 update메소드를 통해 해당 회원의 정보를 수정하시오
		// 조건 1. 하나라도 입력안한 데이터가 있으면 updateForm.jsp로 다시 돌려보내면서
		// 			updateForm.jsp에서는 "모든 내용을 입력하세요"라는 모달창을 띄우세요
		// 조건 2. 회원수정에 실패 했을때에는 joinForm.jsp로 다시 돌려보내면서
		//			joinForm.jsp에서는 "회원수정이 실패했습니다." 라는 모달창을 띄우세요
		// 조건 3. 회원수정에 성공 했을떄에는 index.jsp로 다시 돌려보내면서
		//			index.jsp에서는 "회원정보 수정에 성공했습니다" 라는 모달창을 띄우세요
		
		// 유효성 검사
		if(m.getMemID() == null || m.getMemID().equals("")||
				m.getMemPassword() == null || m.getMemPassword().equals("") ||
				m.getMemName() == null || m.getMemName().equals("") ||
				m.getMemAge() == 0 ||
				m.getMemEmail() == null || m.getMemEmail().equals("")) {
			rttr.addFlashAttribute("msgType","실패메세지");
			rttr.addFlashAttribute("msg","모든 내용을 입력하세요");
			
			return "redirect:/updateForm.do";
		}else {
			m.setMemProfile("");
			int cnt = mapper.update(m);
			
			if(cnt == 1) {
				rttr.addFlashAttribute("msgType","성공메세지");
				rttr.addFlashAttribute("msg","회원정보 수정에 성공했습니다");

				session.setAttribute("mvo", m);
				
				return "redirect:/";
			}else {
				rttr.addFlashAttribute("msgType","실패메세지");
				rttr.addFlashAttribute("msg","회원정보 수정에 실패했습니다.");
					
				return "redirect:/updateForm.do";
			}
		}
	}
}






