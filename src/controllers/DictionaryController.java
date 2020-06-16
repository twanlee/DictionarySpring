package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String showSearchForm(){
        return "search";
    }
    @PostMapping("/search")
    public String result(
            @RequestParam
            String word,
            Model model
    ){
        Map english = new HashMap();
        english.put("hello","xin chào");
        english.put("hi","xin chào");
        english.put("greet","xin chào");

        String result = (String) english.get(word);
        if(result==null){
            result="Not Found";
        }else {
            model.addAttribute("result",result);
        }
        return "search";
    }
}
