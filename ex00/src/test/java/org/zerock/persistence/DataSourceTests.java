package org.zerock.persistence;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//Java 설정을 사용하는 경우
//@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class DataSourceTests {
	
}
