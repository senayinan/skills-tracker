package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String createSkillsPage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Descriptive Title</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    @ResponseBody
    public String skillForm() {
        return "<html>" +
                "<body>" +
                "<form method= 'post'>" +
                "<label>Name<br/><input type= 'text' name= 'name'/></label><br/>" +
                "<label>My Favorite Language<br/>" +
                "<select name= \"firstlang\" id= \"firstlang\">" +
                "<option value = \"Java\">Java</option>" +
                "<option value = \"Javascript\">Javascript</option>" +
                "<option value = \"Python\">Python</option>" +
                "</select>" +
                "</label><br/>" +

                "<label>My Second Favorite Language<br/>" +
                "<select name= \"secondlang\" id= \"secondlang\">" +
                "<option value = \"Java\">Java</option>" +
                "<option value = \"Javascript\">Javascript</option>" +
                "<option value = \"Python\">Python</option>" +
                "</select>" +
                "</label><br/>" +

                "<label>My Third Favorite Language<br/>" +
                "<select name= \"thirdlang\" id= \"thirdlang\">" +
                "<option value = \"Java\">Java</option>" +
                "<option value = \"Javascript\">Javascript</option>" +
                "<option value = \"Python\">Python</option>" +
                "</select>" +
                "</label><br/>" +
                "<input type= \"submit\" value= \"Submit\"/>" +
                "</body>" +
                "</html>";
    }
    @PostMapping("/form")
    @ResponseBody
    public String respondToForm(@RequestParam String name,
                                @RequestParam String firstlang,
                                @RequestParam String secondlang,
                                @RequestParam String thirdlang) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr><th>First Language</th><th>Second Language</th><th>Third Language</th></tr>"+
                "<tr><td>" + firstlang + "</td><td>" + secondlang + "</td><td>" + thirdlang + "</td></tr>"+
                "</table>" +
                "</body>" +
                "</html>";
    }


}
