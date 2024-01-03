package com.example.together.controller;

import com.together.togetherpj.constant.Gender;
import com.together.togetherpj.dto.MemberRegisterFormDto;
import com.together.togetherpj.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/member")
@Slf4j
@RequiredArgsConstructor
public class MemberController {
  private final MemberService memberService;

  @GetMapping("/register")
  public String register(Model model) {
    model.addAttribute("genderTypes", Gender.values());
    model.addAttribute("memberRegisterFormDto", new MemberRegisterFormDto());
    return "member/register-form";
  }

  @PostMapping("/register")
  public String memberForm(
      @Valid MemberRegisterFormDto registerFormDto,
      BindingResult bindingResult,
      Model model) {
    log.info("member controller register");
    if (bindingResult.hasErrors()) {
      log.info("there are something errors");
      log.info("bindingResult error:{}", bindingResult);
      return "member/register-form";
    }

    log.info("member controller binding check");
    try {
      memberService.saveMember(registerFormDto);
      log.info("member controller member saved");
    } catch (IllegalStateException e) {
      log.info("member controller catch error");
      model.addAttribute("errorMessage", e.getMessage());
      return "member/register-form";
    }

    return "redirect:/";
  }

  @GetMapping("/login")
  public String login(){
    return "member/login";
  }

  @GetMapping("/login/error")
  public String loginError(Model model){
    model.addAttribute("loginErrorMsg", "아이디 또는 패스워드가 잘못되었습니다.");
    return "member/login";
  }

}