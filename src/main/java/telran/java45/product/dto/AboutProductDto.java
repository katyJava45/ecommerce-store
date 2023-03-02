package telran.java45.product.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class AboutProductDto {
    List<ColorSizeQuantityDto> colorSizeQuantity;
    String mainImgUrl;
    List<String> photos;
    String description;
    String details;
}
