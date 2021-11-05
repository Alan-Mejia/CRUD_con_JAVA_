package org.generation.jpamysqlsample.repository;

import org.generation.jpamysqlsample.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//Los repositorios son interfaces
public interface UserRepository
                        //<nombre_de_la_entidad, Yipo_de_dato_del_ID>
    extends CrudRepository<User, Integer>
{
    ArrayList<User> findByName(String name);//Solo se crea solo prototipo de la funcion que va a buscar por nombre en la tabla
}
