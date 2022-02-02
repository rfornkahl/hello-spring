package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Robert Fornkahl
 */

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //    // Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

     //Handles requests of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

//    // Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public static String createMessage(@RequestParam String languages, String name) {
        if (languages.equals("English")) {
            return "Hello, " + name + "!";
        } else if (languages.equals("French")) {
            return "Bonjour, "  + name +  "!";
        } else if (languages.equals("Russian")) {
            return "Privet, "+ name + "!";
        } else if (languages.equals("Spanish")) {
            return "Hola, " + name + "!";
        } else if (languages.equals("Japanese")) {
            return "Kon'nichiwa, " + name+ "!";
        } else {
            return "Hello " + name+ "!";
        }
    }

    // /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<select name='languages' id= 'languages'>" +
                "<option value='English'>English</option>" +
                "<option value='French'>French</option>" +
                "<option value='Russian'>Russian</option>" +
                "<option value='Spanish'>Spanish</option>" +
                "<option value='Japanese'>Japanese</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}



