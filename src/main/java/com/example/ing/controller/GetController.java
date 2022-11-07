package src.main.java.com.example.ing.controller;

import java.util.Map;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    //로그 출력 코드
    private final Logger LOGGER = LoggerFactory.getLogger(GetController.class);

    // @RequestMapping 어노테이션을 별다른 설정 없이 선언하면 HTTP의 모든 요청을 받음
    // method 요소의 값을 RequestMethod.GET으로 설정하면 요청 형식을 GET으로만 설정할 수 있음
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        LOGGER.info("getHello 메소드가 호출되었습니다.");
        return "Hello World";
    }
    // 매개변수가 없는 GET 메서드 구현
    @GetMapping(value = "/name")
    public String getName() {
        LOGGER.info("getName 메소드가 호출되었습니다.");
        return "Flature";
    }
    // URL자체에 값을 담아 요청 -> 처리
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        LOGGER.info("@PathVariable을 통해 들어온 값 : {}", variable);
        return variable;
    }
    // 어노테이션에 지정한 변수의 이름과 메서드 매개변수의 이름을 동일하게 맞추기 어려운 경우
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }
    // 쿼리 형식으로 전달
    @ApiOperation(value = "GET 메소드 예제", notes = "@RequestParam을 활용한 GET Method")
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @ApiParam(value = "이름", required = true) @RequestParam String name,
            @ApiParam(value = "이메일", required = true) @RequestParam String email,
            @ApiParam(value = "회사", required = true) @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }
    // 쿼리스트링에 어떤 값이 들어올지 모르는 경우 Map 객체 활용
    // 아래처럼 작성하면, 값에 상관없이 요청을 받을 수 있음
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }
}
