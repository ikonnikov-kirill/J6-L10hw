package J6L10hw.mapper;

import J6L10hw.dto.CustomerDto;
import J6L10hw.model.Customer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerMapper {
    public static Customer toCustomer(CustomerDto customerDto) {

        return Customer.builder()
                .id(customerDto.getId())
                .name(customerDto.getName())
                .build();
    }

    public static CustomerDto fromCustomer(Customer customer) {

        return CustomerDto.builder()
                .id(customer.getId())
                .name(customer.getName())
                .build();
    }

    public static List<Customer> toCustomers(List<CustomerDto> customerDtoList) {
        return customerDtoList.stream()
                .map(CustomerMapper::toCustomer)
                .sorted(Comparator.comparing(Customer::getName))
                .collect(Collectors.toList());
    }

    public static List<CustomerDto> fromCustomers(List<Customer> customerList) {
        return customerList.stream()
                .map(CustomerMapper::fromCustomer)
                .sorted(Comparator.comparing(CustomerDto::getName))
                .collect(Collectors.toList());
    }
}
