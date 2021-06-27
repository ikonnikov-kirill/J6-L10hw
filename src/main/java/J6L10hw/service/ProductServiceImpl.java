package J6L10hw.service;

import J6L10hw.dto.ProductDto;
import J6L10hw.mapper.ProductMapper;
import J6L10hw.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDto> findAll() {
        return ProductMapper.fromProducts(productRepository.findAll());
    }

    @Override
    public ProductDto findById(int id) {
        return
                ProductMapper.fromProduct(productRepository.findById(id));
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        productRepository.save(ProductMapper.toProduct(productDto));
        return productDto;
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }


}
