package telran.java45.product.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.java45.product.dto.ColorSizeQuantityDto;
import telran.java45.product.dto.SubCategoryDto;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ProductAttributes implements Serializable {

	private static final long serialVersionUID = 6345297422396665776L;
	
	String category;
    SubCategoryDto subCategory;
    String brand;
    String collection;
    String season;
    String style;
}
