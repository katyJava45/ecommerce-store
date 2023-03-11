package telran.java45.product.servise;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.java45.person.dto.exceptions.ProductNotFoundException;
import telran.java45.product.dao.ProductRepository;
import telran.java45.product.dto.AboutProductDto;
import telran.java45.product.dto.ProductCreateDto;
import telran.java45.product.dto.ProductResponseDto;
import telran.java45.product.dto.SubCategoryDto;
import telran.java45.product.model.AboutProduct;
import telran.java45.product.model.Product;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	
	final ProductRepository productRepository;
	final ModelMapper modelMapper;

	@Override
	public ProductResponseDto addProduct(ProductCreateDto productCreateDto) {
		System.out.println("pcd " + productCreateDto.getProductName());
		Product product = modelMapper.map(productCreateDto, Product.class);
		System.out.println("p " + product.getProductId());
		product = productRepository.save(product);
		return modelMapper.map(product, ProductResponseDto.class);
		
	}

	@Override
	public ProductResponseDto deleteProduct(int productId) {
		Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException());
		productRepository.delete(product);
		return modelMapper.map(product, ProductResponseDto.class);
	}

	@Override
	public ProductResponseDto updateProduct(int productId, ProductCreateDto productCreateDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductResponseDto findProductById(int productId) {
		Product product = productRepository.findById(productId).orElseThrow(()->new ProductNotFoundException());
		
		return modelMapper.map(product, ProductResponseDto.class);
	}

	@Override
	public Iterable<ProductResponseDto> getNewArrivals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<SubCategoryDto> getAvailableSubcategory(SubCategoryDto subCategoryDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ProductResponseDto> getListOfProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ProductResponseDto> searchByProductName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ProductResponseDto> searchByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
