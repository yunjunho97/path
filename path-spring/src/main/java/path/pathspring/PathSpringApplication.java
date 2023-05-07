package path.pathspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import path.pathspring.domain.Point;

@SpringBootApplication
public class PathSpringApplication {

	public static void main(String[] args) {
		//Point point = new Point();
		//point.setStartPoint("4");
		SpringApplication.run(PathSpringApplication.class, args);
		//System.out.println("end");
	}

}
