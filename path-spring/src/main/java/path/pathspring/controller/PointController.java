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

    @PostMapping("/point/new2")
    public String createNew(PointForm form){
        point.setStartPoint(form.getName());
        pointService2.findNewPath(point, Integer.parseInt(point.getStartPoint()));
        return "redirect:/link";
    }

    @GetMapping("/link")
    public String createNew1(Model model){
        ArrayList<Integer> list = (ArrayList<Integer>) point.getPath();

        int holdI = 0;
        String maPP = "4";
        if(list.size() > 0){
            String hold = Integer.toString(list.get(0));
            char holdC = hold.charAt(0);
            holdI = holdC - '0';
            maPP = holdC + "cmd.jpg";
        }
        model.addAttribute("maPP", maPP);

        ArrayList<Integer> list1 = new ArrayList<>();
        while(true){
            if(list.size() <= 0){
                break;
            }
            String hold1 = Integer.toString(list.get(0));
            char holdC1 = hold1.charAt(0);
            int holdI1 = holdC1 - '0';
            if(holdI == holdI1){
                list1.add(list.get(0));
                list.remove(list.get(0));
            } else {
                break;
            }
        }
        point.setPath(list);

        model.addAttribute("list", list1);
        System.out.println("aaa" + list);
        System.out.println("bbb" + list1);
        return "home1";
    }

    @PostMapping("/point/new3")
    public String createNew2(){
        System.out.println(point.getPath());
        return "redirect:/link";
    }

}
