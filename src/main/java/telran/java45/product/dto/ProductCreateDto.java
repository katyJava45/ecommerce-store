package telran.java45.product.dto;

import lombok.Getter;

@Getter
public class ProductCreateDto {
	
    String productName;
    ProductAttributesDto productAttributes;
    Double price;
    Double discount;
    String promoCode;
    AboutProductDto aboutProduct;
    boolean newArrival;
}
