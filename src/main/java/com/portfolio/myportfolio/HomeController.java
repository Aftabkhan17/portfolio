package com.portfolio.myportfolio;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index.html"; // from static folder
    }
    
    @PostMapping("/contact")
@ResponseBody
public ResponseEntity<String> handleForm(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam String message) {

    // This will print the submitted data in your terminal (backend)
    System.out.println("📩 Contact Form Submission:");
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
    System.out.println("Message: " + message);

    // This sends a response back to the browser
    return ResponseEntity.ok("Thanks for reaching out, " + name + "!");
}

}
