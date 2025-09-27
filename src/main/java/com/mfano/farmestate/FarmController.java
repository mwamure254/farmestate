package com.mfano.farmestate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FarmController {
	
	@GetMapping("/home")
    public String goHome() {
        return "index";
    }
	
}
