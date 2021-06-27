package J6L10hw.service;

import J6L10hw.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> findAll();

    CustomerDto findById(int id);

}
