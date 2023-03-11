package telran.java45.product.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDto {
	Integer productId;
    String productName;
    LocalDate productReceiptDate;
    ProductAttributesDto productAttributes;
    Double price;
    Double discount;
    String promoCode;
    AboutProductDto aboutProduct;
    boolean newArrival;
}
