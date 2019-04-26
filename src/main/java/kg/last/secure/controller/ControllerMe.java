package kg.last.secure.controller;

import kg.last.secure.model.Me;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMe {
    @GetMapping("/cashier")
    public Me getCashier(){
        return new Me(1, "I'm seen only by cashier");
    }

    @GetMapping("/check")
    public Me getSupervisor(){
        return new Me(1, "I'm seen only by Supervisor");
    }

    @GetMapping("/general")
    public Me getGeneral(){
        return new Me(1, "I'm seen by cashier and supervisor");
    }

    @GetMapping("/shared")
    public Me getShare(){
        return new Me(1, "I'm seen by all");
    }
}
