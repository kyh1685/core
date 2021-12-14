package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // Filter를 이용해서 제외할 클래스를 설정한다.
        // @Configuration도 클래스 안에 들어가보면 @ComponentScan을 가지고 있다.
        // 설정이 중복되면 안되니까 만들어놓은 AppConfig 제거를 위해 작성
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
