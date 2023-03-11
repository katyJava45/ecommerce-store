package telran.java45.product.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class AboutProductDto {
    Iterable<ColorSizeQuantityDto> colorSizeQuantity;
    String mainImgUrl;
    Iterable<String> photos;
    String description;
    String details;
}
