package web.services;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private CarDao carDao = new CarDaoImpl();
    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> res = carDao.getCars();
        if(count>0 && count<=res.size()){
            return res.subList(0, count);
        }
        return res;
    }
}
