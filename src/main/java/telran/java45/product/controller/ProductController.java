package telran.java45.product.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java45.product.dto.ProductCreateDto;
import telran.java45.product.dto.ProductResponseDto;
import telran.java45.product.dto.SubCategoryDto;
import telran.java45.product.servise.ProductService;

@RestController
@RequiredArgsConstructor
public class ProductController {
	final ProductService productService;

	@PostMapping("/products/")
	public ProductResponseDto addProduct(@RequestBody ProductCreateDto productCreateDto) {
		
		return productService.addProduct(productCreateDto);
	}

	@DeleteMapping("/products/{productId}")
	public ProductResponseDto deleteProduct(@PathVariable int productId) {
	
		return productService.deleteProduct(productId);
	}

	@PutMapping("/products/{productId}")
	public ProductResponseDto updateProduct(@PathVariable int productId,@RequestBody ProductCreateDto productCreateDto) {
		
		return productService.updateProduct(productId, productCreateDto);
	}

	@GetMapping("/products/{productId}")
	public ProductResponseDto findProductById(@PathVariable int productId) {
		
		return productService.findProductById(productId);
	}

	@GetMapping("/products/new")
	public Iterable<ProductResponseDto> getNewArrivals() {
		
		return productService.getNewArrivals();
	}

	@GetMapping("/products/category/{category}")
	public Iterable<ProductResponseDto> getAvailableSubcategory(SubCategoryDto subCategoryDto) {
		
		return productService.getNewArrivals();
	}
	
	@GetMapping("/products")
	public Iterable<ProductResponseDto> getListOfProducts(){
		
		return productService.getListOfProducts();
	}
	
	@GetMapping("/search/{productName}")
	public Iterable<ProductResponseDto> searchByProductName(@RequestParam String productName) {
		
		return productService.searchByProductName(productName);
	}

	@GetMapping("/seach/{brand}")
	public Iterable<ProductResponseDto> searchByBrand(@RequestParam String brand) {
		
		return productService.searchByBrand(brand);
	}
}
