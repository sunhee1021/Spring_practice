package org.zerock.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample")
@Log4j
public class SampleController {
	
	@RequestMapping(value="/getText", method=RequestMethod.GET,
			produces = "text/plain; charset=UTF-8")
	public String getText() {
		
		log.info("MIME TYPE: " + MediaType.TEXT_PLAIN_VALUE);
		
		return "안녕하세요";
	}
	
	@RequestMapping(value="/getSample", method=RequestMethod.GET,
			produces = {
				MediaType.APPLICATION_JSON_UTF8_VALUE,
				MediaType.APPLICATION_XML_VALUE
			})
	
	public SampleVO getSample() {
		
		return new SampleVO(112,"스타","로드");
	}
	
	@RequestMapping(value="/getSample2", method=RequestMethod.GET)
	public SampleVO getSample2() {
		
		return new SampleVO(113,"스타","로드");
	}
	
//	@RequestMapping(value="/getList", method=RequestMethod.GET)
//	public List<SampleVO> getList() {
//		
//		return IntStream range(1,10).mapToObj(i -> 
//		new SampleVO(i, i+"First", i+"Last"))
//				.collect(Collectors.toList());
//	}
	
	@RequestMapping(value="/getMap", method=RequestMethod.GET)
	public Map<String, SampleVO> getMap() {
		
		Map<String, SampleVO> map = new HashMap<>();
		map.put("First", new SampleVO(111,"그루트","주니어"));
		
		return map;
	}
	//373페이지부터
}
