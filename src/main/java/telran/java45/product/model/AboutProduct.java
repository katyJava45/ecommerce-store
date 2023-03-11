package telran.java45.product.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.java45.product.dto.ColorSizeQuantityDto;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class AboutProduct implements Serializable{

	private static final long serialVersionUID = -2892837354206543419L;
	
	Iterable<ColorSizeQuantityDto> colorSizeQuantity;
    String mainImgUrl;
    Iterable<String> photos;
    String description;
    String details;
}
