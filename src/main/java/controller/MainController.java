package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import quartjob.JobSchedular;
import service.MyService;
import service.impl.MyServiceImpl;


@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = {"/","index"})
    public String homeController(ModelMap modelMap) {
        modelMap.addAttribute("message", "love you ");
        MyServiceImpl myService=new MyServiceImpl();
        myService.convert();
        JobSchedular jobSchedular=new JobSchedular();
        jobSchedular.jobStrater();
        return "index";
    }


}