package pe.edu.i202030295.valentin_araceli.response;

import pe.edu.i202030295.valentin_araceli.dto.CarDetailDto;

public record GetDetailCarResponse(String code,
                                   String error,
                                   CarDetailDto carDetailDto) {
}
