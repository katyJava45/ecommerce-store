package telran.java45.product.servise;

import java.util.List;

import telran.java45.product.dto.ProductCreateDto;
import telran.java45.product.dto.ProductResponseDto;
import telran.java45.product.dto.SubCategoryDto;

public interface ProductService {
	ProductResponseDto addProduct(ProductCreateDto productCreateDto);
	ProductResponseDto deleteProduct(int productId);
	ProductResponseDto updateProduct(int productId, ProductCreateDto productCreateDto);
	//FIXME
	//List<ProductResponseDto> getProductsListByFilter(List<Filters>);
	ProductResponseDto findProductById(int productId);
	Iterable<ProductResponseDto> getNewArrivals();
	Iterable<SubCategoryDto> getAvailableSubcategory(SubCategoryDto subCategoryDto);
	Iterable<ProductResponseDto> getListOfProducts();
	Iterable<ProductResponseDto> searchByProductName(String productName);
	Iterable<ProductResponseDto> searchByBrand(String brand);
	
}
