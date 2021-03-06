package school.project.controllers;


import school.project.dao.UserDAO;
import school.project.models.Role;
import school.project.models.User;
import school.project.models.custom.Students;
import school.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
//123
    @GetMapping("/")
    public String index() {
        return "login";
    }


    @PostMapping("/successURL")
    public String successURL() {
        System.out.println("You succes login");
        return "redirect:/pages";
    }

}
