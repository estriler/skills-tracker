package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping
    @ResponseBody
    public String skillsMessage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Eric</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>React</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.POST}, value ="skillsHome")
    @GetMapping
    @ResponseBody
    public String skillsMessage(@RequestParam String name, @RequestParam String skill1, @RequestParam String skill2, @RequestParam String skill3){
        return "<html>" +
                    "<body>" +
                        "<h1>"+name+"</h1>" +
                        "<ol>" +
                            "<li>"+skill1+"</li>" +
                            "<li>"+skill2+"</li>" +
                            "<li>"+skill3+"</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                    "<body>" +
                        "<form action='skillsHome' method='post'>" +
                            "<div>" +
                                "<label>Name: " +
                                    "<input type='text' name='name'>" +
                                "</label>" +
                            "</div>" +
                            "<div>" +
                                "<label>My favorite language: " +
                                "<select name ='skill1'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Javascript'>JavaScript</option>" +
                                    "<option value='React'>React</option>" +
                                "</select> </label>" +
                            "</div>" +
                            "<div>" +
                                "<label>My second favorite language: " +
                                "<select name ='skill2'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Javascript'>JavaScript</option>" +
                                    "<option value='React'>React</option>" +
                                "</select> </label>" +
                            "</div>" +
                            "<div>" +
                                "<label>My third favorite language: " +
                                "<select name ='skill3'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Javascript'>JavaScript</option>" +
                                    "<option value='React'>React</option>" +
                                "</select> </label>" +
                            "</div>" +
                            "<div>"  +
                                "<input type='submit' value='Submit'>" +
                            "</div>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

}
