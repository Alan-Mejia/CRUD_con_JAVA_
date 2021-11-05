package org.generation.jpamysqlsample.service;


import org.generation.jpamysqlsample.model.User;

import java.util.ArrayList;

//Se encarga de la parte logica
public interface UserService
{
    //Quiero recuperar un usuario
    User getUser( Integer id );
    //Quiero guardar un usuario
    User save( User user );
    //Quiero borrar un usuario
    void delete( Integer id );

    ArrayList<User> findByName(String name);
}
