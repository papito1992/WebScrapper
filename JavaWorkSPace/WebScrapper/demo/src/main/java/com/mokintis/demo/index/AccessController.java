package com.mokintis.demo.index;

import com.mokintis.demo.model.DataBank;
import com.mokintis.demo.model.Keyword;
import com.mokintis.demo.model.LinkTable;
import com.mokintis.demo.service.DataBankService;
import com.mokintis.demo.service.KeywordService;
import com.mokintis.demo.service.LinkTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class AccessController {
@Autowired
    DataBankService dbs;
@Autowired
    KeywordService keywordService;
@Autowired
    LinkTableService lts;

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public ModelAndView orderall(){
        ModelAndView modelAndView = new ModelAndView("adminpage");
        return modelAndView;
    }
    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public ModelAndView Main(){
        ModelAndView modelAndView = new ModelAndView("main");
        return modelAndView;
    }

    @RequestMapping(value = "/res", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public ModelAndView requestResults(HttpServletResponse response) {
        ModelAndView model = new ModelAndView("adminpage");
        List<DataBank> dataBanks = dbs.getData();
        model.addObject("reslist",dataBanks);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        return model;
    }

    @RequestMapping(value = "/keywords", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public ModelAndView keywords(HttpServletResponse response) {
        ModelAndView model = new ModelAndView("test");
        List<Keyword> keywordList = keywordService.getKeywords();
        model.addObject("keylist",keywordList);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        return model;
    }
    @RequestMapping(value = "/getLinks", method = RequestMethod.GET)

    public ModelAndView testt(HttpServletResponse response){
        Job job = new Job();
        ModelAndView model = new ModelAndView("Links");
        List<LinkTable> linkTableList = lts.getLinks();

        model.addObject("linklist", linkTableList);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        return model;
    }
}
