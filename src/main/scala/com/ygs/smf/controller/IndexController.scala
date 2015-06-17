package com.ygs.smf.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by songyougang on 6/17/15 13:31.
 */
@Controller
class IndexController {

  @RequestMapping(Array("/index"))
  def index(modelMap: ModelMap) = {
    modelMap.put("greeting", "Hello!")
    "index"
  }
}
