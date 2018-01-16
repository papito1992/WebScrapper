package com.mokintis.demo.index;


import com.mokintis.demo.model.DataBank;
import com.mokintis.demo.model.Keyword;
import com.mokintis.demo.model.LinkTable;
import com.mokintis.demo.service.DataBankService;
import com.mokintis.demo.service.KeywordService;
import com.mokintis.demo.service.LinkTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@Controller
public class KeywordController {
@Autowired
    KeywordService ks;
@Autowired
LinkTableService lts;

    @Autowired
    DataBankService dbs;


@RequestMapping(value = "/getKeys", method = RequestMethod.GET)
///            @ResponseBody
public ModelAndView testt(HttpServletResponse response){
    Job job = new Job();
    ModelAndView model = new ModelAndView("test");
    List<Keyword> keywordList = ks.getKeywords();

//    List<LinkTable> linkList = lts.getLinks();
//    try {
//        Map<String, List> run = job.run(keywordList);
//        model.addObject("map", run);
//    } catch (IOException e) {
//        e.printStackTrace();
//    }


    model.addObject("list", keywordList);
    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");

    return model;
}


    @RequestMapping(value = "/results", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public ModelAndView results(HttpServletResponse response){
        ModelAndView model = new ModelAndView("adminpage");
        List<DataBank> dataBanks=dbs.getData();
        model.addObject("list1", dataBanks);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        return model;
    }

@RequestMapping(value = "/sendRequest", method = RequestMethod.GET)
public void viewAll(HttpServletResponse response) throws IOException, SQLException {
//    ModelAndView model= new ModelAndView("adminpage");
    List<Keyword> keywordList=ks.getKeywords();
    List<LinkTable> linkTableList=lts.getLinks();
    Job job= new Job();
    List<DataBank> listrun = job.run(keywordList, linkTableList);
    dbs.insertData(listrun);
//    model.addObject("listrun", listrun );
//    response.setContentType("text/html");
//    response.setCharacterEncoding("UTF-8");
  response.sendRedirect("res");
}

    @RequestMapping (value ="/addkeyword")
    public String addKeyword(@RequestParam("keyword") String keyword, Model model, HttpSession session){
        Keyword keyword1 = new Keyword();
session.setAttribute("loginaddmin", 1);
        keyword1.setKeywords(keyword);
        try{

            ks.insertKeyword(keyword1);
            return "getKeys"; //redirect user to contact list url
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to add keyword");
            return "getKeys";
        }}

//    @RequestMapping (value ="/addkeyword")
//    public String addKeyword(@ModelAttribute("addkey") Keyword keyword, Model model, HttpSession session){
//        //we need to specify the user, contact is child entity
//        try{
//
//            ks.insertKeyword(keyword);
//            return "addkeyword_form"; //redirect user to contact list url
//        }catch (Exception e){
//            e.printStackTrace();
//            model.addAttribute("err","failed to add keyword");
//            return "addkeyword_form";
//        }}

    @RequestMapping (value ="/updateKey", method = RequestMethod.POST)
    public String updateKeyword(@RequestParam( value = "id") int  id, @RequestParam(value = "keyword") String keyword,  Model model, HttpSession session){
        //we need to specify the user, contact is child entity
        try{
Keyword keyword1 = new Keyword();
keyword1.setId(id);
keyword1.setKeywords(keyword);
            ks.updateKeyword(keyword1);
            return "updatekeyword_form"; //redirect user to contact list url
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to add keyword");
            return "updatekeyword_form";
        }}


    @RequestMapping (value ="/delkeywordId")
    public String delKeyworder(@RequestParam("id") int keywordId, Model model, HttpSession session){
        //we need to specify the user, contact is child entity


//        if (session.getAttribute("loginname").toString().equals(1)){
//
//        }

        try{
ks.deleteKeywordId(keywordId);
//ks.deleteKeyword(keyword);
            return "delkeyword_form"; //redirect user to contact list url
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to del keyword");
            return "delkeyword_form";
        }}
    @RequestMapping (value ="/delSendRequestId")
    public String delDataRow(@RequestParam("id") int dataId, Model model, HttpSession session){
        //we need to specify the user, contact is child entity


//        if (session.getAttribute("loginname").toString().equals(1)){
//
//        }

        try{
            dbs.deleteData(dataId);
//ks.deleteKeyword(keyword);
            return "delkeyword_form"; //redirect user to contact list url
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to del keyword");
            return "delkeyword_form";
        }}

}
