package pe.edu.i202030295.valentin_araceli.service;

import pe.edu.i202030295.valentin_araceli.dto.CarCreateDto;
import pe.edu.i202030295.valentin_araceli.dto.CarDetailDto;
import pe.edu.i202030295.valentin_araceli.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;
    Optional<CarDetailDto> getDetailCar(int id) throws Exception;
    boolean updateCar(CarDto carDto) throws Exception;
    boolean deleteCar(int id) throws Exception;
    boolean createCar(CarCreateDto carCreateDto) throws Exception;
}
