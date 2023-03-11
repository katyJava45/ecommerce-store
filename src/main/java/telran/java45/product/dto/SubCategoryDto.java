package telran.java45.product.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class SubCategoryDto {
    String name;
    Iterable<String> extendableCategories;
}
