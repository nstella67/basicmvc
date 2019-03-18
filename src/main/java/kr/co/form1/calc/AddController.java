package kr.co.form1.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//스프링 프레임워크 특징
//	→ 어노테이션 방식으로 구성
//	→ 환경설정이 복잡하다 

//스프링 컨테이너(서버)에서 자동으로 객체 생성
//	→ @Controller
//	→ @Autowired
//	→ @Component

@Controller
public class AddController {

	public AddController() {
		System.out.println("-----AddContoller() 객체 생성");
	}
	
	//	→ @RequestMapping 요청명령어 등록
	//	→ 요청명령어 등록 후 실행의 주체는 메소드로 한다		
	@RequestMapping("/plus.do")
	public ModelAndView plus(HttpServletRequest req) {
		//사용자 요청값 가져오기
		int no1=Integer.parseInt(req.getParameter("no1"));
		int no2=Integer.parseInt(req.getParameter("no2"));
		System.out.println(no1);
		System.out.println(no2);
		
		int result=no1+no2;
		
		//View단으로 이동하기 위한 클래스
		//	→Model
		//	→ModelAnd View
		ModelAndView mav=new ModelAndView();
		//view페이지 이동
		//	→ prefix="/", suffix=".jsp"
		//	→ /calc/calcResult.jsp
		mav.setViewName("calc/calcResult");
		
		//공유장소인 req 영역에 값 올리기
		req.setAttribute("msg", "<h1>두 수의 합</h1>");
		req.setAttribute("img", "<img src='images/해달.gif'>");
		
		req.setAttribute("no1", no1);
		req.setAttribute("no2", no2);
		req.setAttribute("result", result);
		
		
		return mav;
	}//public end

}//class end
