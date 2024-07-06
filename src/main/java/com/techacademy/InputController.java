package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(name = "previous", required = false) String previous, Model model) {
        //previousパラメータが存在する場合、Modelに登録
        if (previous != null) {
            model.addAttribute("previous", previous);
        }
        // input.htmlに画面遷移
        return "input";
    }

    @PostMapping("/output")
    public String postForm(@RequestParam(name = "val") String val, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("val", val);
        // output.htmlに画面遷移
        return "output";
    }

}
