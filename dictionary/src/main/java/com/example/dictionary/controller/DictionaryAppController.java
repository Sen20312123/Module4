package com.example.dictionary.controller;

import com.example.dictionary.service.Dictionary;
import com.example.dictionary.service.IDictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DictionaryAppController {
@GetMapping("/DictionaryAppController")
    public ModelAndView showList(){
            ModelAndView modelAndView = new ModelAndView("home");
            return modelAndView;
}
@PostMapping("/DictionaryAppController")
    public String greeting (String word , Model model){
    IDictionary addAttribute = new Dictionary();
    model.addAttribute("word", word);
    model.addAttribute("newWord", addAttribute.dictionary(word));
    return "home";
}
}
