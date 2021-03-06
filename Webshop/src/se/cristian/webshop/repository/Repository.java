package se.cristian.webshop.repository;

import java.util.Map;

import se.cristian.webshop.exception.RepositoryException;

public interface Repository <K, T>
{
	T create(T value);
	T delete(K value) throws RepositoryException;
	T update(K id, T value) throws RepositoryException;
	T read(K id) throws RepositoryException;
	Map<K, T> readAll();
}
