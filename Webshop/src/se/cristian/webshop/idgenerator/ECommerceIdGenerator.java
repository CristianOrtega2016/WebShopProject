package se.cristian.webshop.idgenerator;

import java.util.UUID;

public class ECommerceIdGenerator implements IdGenerator<String>
{

	@Override
	public String getGeneratedId() 
	{
	
		return UUID.randomUUID().toString();
	}
	
}
