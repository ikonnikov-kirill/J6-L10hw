package J6L10hw.service;

import J6L10hw.dto.CustomerDto;
import J6L10hw.mapper.CustomerMapper;
import J6L10hw.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> findAll() {
        return CustomerMapper.fromCustomers(
                customerRepository.findAll());
    }

    @Override
    public CustomerDto findById(int id) {
        return CustomerMapper.fromCustomer(
                customerRepository.findById(id)
        );
    }
}
