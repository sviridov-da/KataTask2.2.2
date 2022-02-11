package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;
@Component
public interface CarService {
    List<Car> getCars();
    List<Car> getCars(int count);
}
