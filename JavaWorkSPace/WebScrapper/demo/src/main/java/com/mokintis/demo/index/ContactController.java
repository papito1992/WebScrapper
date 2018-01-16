package com.mokintis.demo.index;

import com.mokintis.demo.model.Contact;
import com.mokintis.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;
    @RequestMapping(value ="/contact_form")
    public String contactForm(Model model){
        Contact con= new Contact();
                model.addAttribute("command", con);
        return "contact_form"; //JSP PAGE
    }

    @RequestMapping(value ="/clist")
    public String contactList(Model model){

        return "clist"; //JSP PAGE
    }
    @RequestMapping(value ="/delCon")
    public String delKeyworder(@ModelAttribute("command")Contact keyword, Integer id, Model model){
        //we need to specify the user, contact is child entity
        try{


            contactService.deletesinglecontact(id);
            return "deletcont"; //redirect user to contact list url
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to del keyword");
            return "deletcont";
        }}


//    @RequestMapping (value ="/contact_form1")
//    public String contactForm1(Model model){
//        List<Contact> contacts = contactService.findUserContact(1);
//        Job job = new Job();
//        List<GautaInfo> list = job.run(url, contacts);
//        model.addAttribute("command", contacts);
//        return "contact_form"; //JSP PAGE
//    }



    @RequestMapping(value ="/user/save_contact")
    public String saveContact(@ModelAttribute("command") Contact c, Model model, HttpSession session){
        //we need to specify the user, contact is child entity
        try{
        Integer userId= (Integer) session.getAttribute("userid");
        c.setUserid(userId); //FK ; logged in uzers ID
        contactService.savecontact(c);
        return "clist?act=sv"; //redirect user to contact list url
    }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("err","failed to save contact");
            return "contact_form";
        }}
}
