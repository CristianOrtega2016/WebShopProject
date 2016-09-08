package se.cristian.webshop.service.validation;

import se.cristian.webshop.model.Product;
import se.cristian.webshop.repository.FileRepository;
import se.cristian.webshop.repository.Repository;

public class ProductValidator implements DuplicateValidator
{
private Repository<String, Product> productRepository;
	
	public ProductValidator()
	{
		productRepository = new FileRepository<>(Product.class);
	}
	
	@Override
	public boolean alreadyExists(final String productName)
	{
		for (Product product : productRepository.readAll().values())
		{
			if (product.getProductName().equals(productName))
			{
				return true;
			}
		}
		return false;
}
}
