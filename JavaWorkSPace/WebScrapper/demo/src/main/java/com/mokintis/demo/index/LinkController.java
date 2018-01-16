package com.mokintis.demo.index;


import com.mokintis.demo.model.LinkTable;
import com.mokintis.demo.service.KeywordService;
import com.mokintis.demo.service.LinkTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class LinkController {
@Autowired
    KeywordService ks;
@Autowired
LinkTableService lts;





    @RequestMapping (value ="/addLink", method = RequestMethod.POST)
    public String addKeyword(@RequestParam("links") String link, Model model, HttpSession session){
        LinkTable linkTable1 = new LinkTable();

        linkTable1.setLinks(link);
        try{

            lts.insertLink(linkTable1);
//            return "addLink_form"; //redirect user to contact list url
            return "getLinks"; //redirect user to contact list url
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to add a link");
//            return "addLink_form";
            return "getLinks";//sukurti
        }}



    @RequestMapping (value ="/updateLink", method = RequestMethod.POST)
    public String updateKeyword(@RequestParam( value = "id") int  id, @RequestParam(value = "links") String keyword,  Model model, HttpSession session){
        //we need to specify the user, contact is child entity
        try{
LinkTable linkTable= new LinkTable();
linkTable.setId(id);
linkTable.setLinks(keyword);
            lts.updateLink(linkTable);
            return "getLinks"; //redirect user to contact list url
//            return "updateLink_form"; //redirect user to contact list url
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to add keyword");
            return "getLinks";//sukurti
//            return "updateLink_form";//sukurti
        }}


    @RequestMapping (value ="/delLinkId")
    public String delKeyworder(@RequestParam("id") int listId, Model model){
        //we need to specify the user, contact is child entity
        try{
lts.deleteLinkId(listId);
//ks.deleteKeyword(keyword);
//            return "delList_form"; //redirect user to contact list url
            return "delkeyword_form"; //redirect user to contact list url
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to del keyword");
            return "delkeyword_form";
//            return "delList_form";
        }}


}
