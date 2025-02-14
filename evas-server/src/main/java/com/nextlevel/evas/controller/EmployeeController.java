package com.nextlevel.evas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.nextlevel.evas.domain.Employee;
import com.nextlevel.evas.form.LoginForm;
import com.nextlevel.evas.form.LoginIdForm;
import com.nextlevel.evas.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class EmployeeController {

  private final EmployeeService employeeService;

  @Autowired
  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @PostMapping("login")
  // json 형태이기 때문에 @ResponseBody, @RequestBody 필요
  @ResponseBody
  // EmployeeLoginForm 과 같이 파라미터 타입이 자바 객체라면 자바 객체로 변환해줌
  // 단, passWd와 같이 자바 객체에 json의 key에 해당하는 값의 변수와 getter가 있어야 함
  public Employee login(@RequestBody LoginForm form) {
    return employeeService.login(form.getLoginId(), form.getPassword());
  }

  @PostMapping("logout")
  public void logout(@RequestBody LoginIdForm form, HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
    employeeService.logout(form.getLoginId(), request, response, authentication);

    // 응답 상태 코드를 200으로 설정
    response.setStatus(HttpServletResponse.SC_OK);
  }

}
