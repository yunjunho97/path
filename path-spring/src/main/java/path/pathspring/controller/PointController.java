package path.pathspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import path.pathspring.domain.Point;
import path.pathspring.service.PointService2;

import java.util.ArrayList;

@Controller
public class PointController {
    private final PointService2 pointService2;
    Point point = new Point();

    public PointController(PointService2 pointService2) {
        this.pointService2 = pointService2;
    }
    /*@PostMapping("/point/new")
    public String create(PointForm form){
        //
        //Map<Integer, List<DijkstraAlgorithm.Edge>> graph =
        //
        //Point point = new Point();
        pointService.join2();
        //pointService.join3();
        point.setStartPoint(form.getName());
        System.out.println(point.getStartPoint());
        //pointService.join(point);
        pointService.join(point);
        System.out.println("aaaaaaaaaaaaaaa");
        System.out.println(point.getList());
        return "redirect:/link";
    }*/

    /*@PostMapping("/point/new1")
    public String create2(PointForm form){
        pointService.join2();
        point.setStartPoint(form.getName());
        pointService.join3(point, Integer.parseInt(point.getStartPoint()));
        System.out.println("bbbbbbbbb");
        System.out.println(point.getPath());
        return "redirect:/link";
    }
*/
    @PostMapping("/point/new2")
    public String createNew(PointForm form){
        point.setStartPoint(form.getName());
        pointService2.findNewPath(point, Integer.parseInt(point.getStartPoint()));
        return "redirect:/link";
    }

    @GetMapping("/link")
    public String createNew1(Model model){
        ArrayList<Integer> list = (ArrayList<Integer>) point.getPath();
        model.addAttribute("list", list);
        return "home1";
    }

    /*@GetMapping("/link")
    public String create1(Model model){
        //ArrayList<String> list = point.getList();
        //model.addAttribute("list", list);
        ArrayList<Integer> list = (ArrayList<Integer>) point.getPath();
        model.addAttribute("list", list);
        return "home1";
    }*/
    
}