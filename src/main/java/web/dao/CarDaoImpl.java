package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Car1", 101, 2001));
        cars.add(new Car("Car2", 102, 2002));
        cars.add(new Car("Car3", 103, 2003));
        cars.add(new Car("Car4", 104, 2004));
        cars.add(new Car("Car5", 105, 2005));
    }
    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        if(count<0 || count>cars.size()){
            return cars;
        }
        return cars.subList(0,count);
    }
}
