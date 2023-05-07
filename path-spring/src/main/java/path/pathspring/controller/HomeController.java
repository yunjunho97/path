package path.pathspring.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import path.pathspring.repository.CreateMMM;
import path.pathspring.service.DijkstraAlgorithm;
import path.pathspring.service.PointService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    /*@RequestMapping("model-session1")
    public String sessionTest2(Model model){
        System.out.println("session");
        Map<Integer, List<DijkstraAlgorithm.Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new DijkstraAlgorithm.Edge(1, 5), new DijkstraAlgorithm.Edge(2, 3)));
        graph.put(1, Arrays.asList(new DijkstraAlgorithm.Edge(3, 7)));
        graph.put(2, Arrays.asList(new DijkstraAlgorithm.Edge(1, 2), new DijkstraAlgorithm.Edge(3, 8)));
        graph.put(3, Arrays.asList(new DijkstraAlgorithm.Edge(4, 2)));
        graph.put(4, Arrays.asList(new DijkstraAlgorithm.Edge(0, 4)));
        model.addAttribute("key3", graph);
        return "redirect:/";
    }*/

}
