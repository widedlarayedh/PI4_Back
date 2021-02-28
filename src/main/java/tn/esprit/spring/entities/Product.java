package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	
	@Column(name = "name")
	private String productName;
	private String productDescription;
	private float productPrice;
	private float productCreationDate;
	private String productImageFileName;
	private String productVideoFileName;
	private int productBarcode;
	
	//With Id
	public Product(int productId, String productName, String productDescription, float productPrice, float productCreationDate, String productImageFileName, String productVideoFileName, int productBarcode) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCreationDate = productCreationDate;
		this.productImageFileName = productImageFileName;
		this.productVideoFileName = productVideoFileName;
		this.productBarcode = productBarcode;
	}
	
	//Without Id
	public Product(String productName, String productDescription, float productPrice, float productCreationDate, String productImageFileName, String productVideoFileName, int productBarcode) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCreationDate = productCreationDate;
		this.productImageFileName = productImageFileName;
		this.productVideoFileName = productVideoFileName;
		this.productBarcode = productBarcode;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productCreationDate=" + productCreationDate
				+ ", productImageFileName=" + productImageFileName + ", productVideoFileName=" + productVideoFileName
				+ ", productBarcode=" + productBarcode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productBarcode;
		result = prime * result + Float.floatToIntBits(productCreationDate);
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productImageFileName == null) ? 0 : productImageFileName.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + Float.floatToIntBits(productPrice);
		result = prime * result + ((productVideoFileName == null) ? 0 : productVideoFileName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productBarcode != other.productBarcode)
			return false;
		if (Float.floatToIntBits(productCreationDate) != Float.floatToIntBits(other.productCreationDate))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productId != other.productId)
			return false;
		if (productImageFileName == null) {
			if (other.productImageFileName != null)
				return false;
		} else if (!productImageFileName.equals(other.productImageFileName))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (Float.floatToIntBits(productPrice) != Float.floatToIntBits(other.productPrice))
			return false;
		if (productVideoFileName == null) {
			if (other.productVideoFileName != null)
				return false;
		} else if (!productVideoFileName.equals(other.productVideoFileName))
			return false;
		return true;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public float getProductCreationDate() {
		return productCreationDate;
	}

	public void setProductCreationDate(float productCreationDate) {
		this.productCreationDate = productCreationDate;
	}

	public String getProductImageFileName() {
		return productImageFileName;
	}

	public void setProductImageFileName(String productImageFileName) {
		this.productImageFileName = productImageFileName;
	}

	public String getProductVideoFileName() {
		return productVideoFileName;
	}

	public void setProductVideoFileName(String productVideoFileName) {
		this.productVideoFileName = productVideoFileName;
	}

	public int getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(int productBarcode) {
		this.productBarcode = productBarcode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	



}
