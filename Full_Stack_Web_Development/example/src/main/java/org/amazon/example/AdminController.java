package org.amazon.example;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin/dashboard")
    @ResponseBody
    public String adminDashboard() {
        return "Welcome to the Admin Dashboard";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user/profile")
    public String userProfile(){
        return "Welcome to the User Dashboard";
    }
}
