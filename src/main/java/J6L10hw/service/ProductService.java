package J6L10hw.service;

import J6L10hw.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();

    ProductDto findById(int id);

    ProductDto save(ProductDto productDto);

    void delete(int id);
}
