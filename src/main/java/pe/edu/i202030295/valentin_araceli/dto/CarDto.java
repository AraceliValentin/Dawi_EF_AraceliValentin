package pe.edu.i202030295.valentin_araceli.dto;

public record CarDto(Integer carId,
                     String ownerName,
                     String ownerContact,
                     String color,
                     Integer mileage,
                     String insuranceCompany,
                     String insurancePolicyNumber) {
}
