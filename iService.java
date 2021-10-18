package za.ac.cput.Service;

public interface iService<T, ID> {
        String id = null;

        public T create(T t);

        public T read(ID id);

        public T update(T t);

        public boolean delete(ID id);


}
