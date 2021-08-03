package za.ac.cput.Repository;

/*
    Entity for uiversity
    Author: Michael Alex Dirks (218306083)
    Date: 25 July 2021
*/

public interface FacultyRepository<T, ID> {
    String id = null;

    public T create(T t);

    public T read(ID id);

    public T update(T t);

    public boolean delete(ID id);


}