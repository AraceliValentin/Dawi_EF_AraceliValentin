package pe.edu.i202030295.valentin_araceli.response;

import pe.edu.i202030295.valentin_araceli.dto.CarDto;

import java.util.List;

public record GetAllCarResponse(String code,
                                String error,
                                List<CarDto> cars) {
}
