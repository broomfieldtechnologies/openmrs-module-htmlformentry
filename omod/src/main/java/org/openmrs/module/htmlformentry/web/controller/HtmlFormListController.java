package org.openmrs.module.htmlformentry.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.openmrs.module.htmlformentry.HtmlForm;
import org.openmrs.module.htmlformentry.HtmlFormEntryUtil;
//import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Lists all the HTML Forms in the database.
 * <p/>
 * Handles {@code htmlForm.list} requests. Renders view {@code htmlFormList.jsp}.
 */
@Controller 
@RequestMapping
public class HtmlFormListController /*extends SimpleFormController*/ {

	/*
	 * @Override protected Object formBackingObject(HttpServletRequest request)
	 * throws Exception { return HtmlFormEntryUtil.getService().getAllHtmlForms(); }
	 */

       
    @RequestMapping(method=RequestMethod.GET) 
    public List <HtmlForm> initializeForm() { 
        return HtmlFormEntryUtil.getService().getAllHtmlForms();
   
        //return ""; 
    } 
    
}
