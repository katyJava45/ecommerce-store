package telran.java45.product.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@EqualsAndHashCode(of = "productId")
@Entity
public class Product implements Serializable  {

	private static final long serialVersionUID = 6671976231446799716L;
	
	@Id
	Integer productId;
	@Setter
    String productName;
    LocalDate productReceiptDate;
    @Setter
    ProductAttributes productAttributes;
    @Setter
    Double price;
    @Setter
    Double discount;
    @Setter
    String promoCode;
    @Setter
    AboutProduct aboutProduct;
    @Setter
    boolean newArrival;
    
    
    
	public Product(String productName, LocalDate productReceiptDate,
			ProductAttributes productAttributes, Double price, Double discount, String promoCode,
			AboutProduct aboutProduct, boolean newArrival) {
		super();
		
		this.productName = productName;
		this.productReceiptDate = productReceiptDate;
		this.productAttributes = productAttributes;
		this.price = price;
		this.discount = discount;
		this.promoCode = promoCode;
		this.aboutProduct = aboutProduct;
		this.newArrival = newArrival;
	}



	public Product() {
		productReceiptDate = LocalDate.now();
	}
    
    
}
