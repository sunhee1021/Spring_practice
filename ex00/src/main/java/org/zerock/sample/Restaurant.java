package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

//스프링에게 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시하는 어노테이션
@Component
@Data
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
/*
 Chef를 주입받을 건데
 Lombok의 setter를 생성하는 기능 + 
         생성자, toString 등을 자동으로 생성하도록 Data 어노테이션을 이용
 */
	//setter는 자동으로 setChef()를 컴파일시 생성 

}
