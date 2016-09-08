package se.cristian.webshop.service.validation;

public interface DuplicateValidator 
{
	boolean alreadyExists(String email);
}
