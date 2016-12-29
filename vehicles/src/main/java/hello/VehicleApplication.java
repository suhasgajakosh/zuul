package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VehicleApplication {

  @RequestMapping(value = "/bike")
  public String bike() {
    return "Royal Enfield";
  }

  @RequestMapping(value = "/car")
  public String car() {
    return "Honda Accord";
  }

  public static void main(String[] args) {
    SpringApplication.run(VehicleApplication.class, args);
  }
}
