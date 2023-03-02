package telran.java45.product.dto;

import lombok.Getter;

@Getter
public class ProductAttributesDto {
    String category;
    SubCategoryDto subCategory;
    String brand;
    String collection;
    String season;
    String style;
}
