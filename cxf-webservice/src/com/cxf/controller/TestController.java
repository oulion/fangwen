package com.cxf.controller;

import com.cxf.service.BCertService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/rcp"})
public class TestController
{
  private final Logger log = LoggerFactory.getLogger(TestController.class);

  @Resource(name="bCertService")
  private BCertService bCertService;

  @RequestMapping(value={"/getHKB"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public String getHKB(HttpServletRequest request, HttpServletResponse response, Model model)
  {
    String paraStr = request.getParameter("paras");

    String result = "";
    result = this.bCertService.GetDetailBcertHkbInfo("{\"paras\":{\"IDNUMBER\":\"" + paraStr + "\"}}");
    this.log.info("访问前置机接口的返回数据===");
    this.log.info(result);
    model.addAttribute("paras", paraStr);
    model.addAttribute("result", result);
    return "hkbTest";
  }

  @RequestMapping(value={"/getSFZ"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public String getSFZ(HttpServletRequest request, HttpServletResponse response, Model model)
  {
    String paraStr = request.getParameter("paras");
    String result = "";
    result = this.bCertService.GetDetailBcertSfzInfo("{\"paras\":{\"IDNUMBER\":\"" + paraStr + "\"}}");
    this.log.info("访问前置机接口的返回数据===" + result);
    model.addAttribute("paras", paraStr);
    model.addAttribute("result", result);
    return "sfzTest";
  }
}