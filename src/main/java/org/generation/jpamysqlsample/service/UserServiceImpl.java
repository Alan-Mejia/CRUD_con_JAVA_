package org.generation.jpamysqlsample.service;

import org.generation.jpamysqlsample.model.User;
import org.generation.jpamysqlsample.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class UserServiceImpl
    implements UserService //Hereda la interfaz UserService
{

    private final UserRepository userRepository;
                            //Realiza la inyeccion con el constructor
    public UserServiceImpl( UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser( Integer id )
    {                                       //finndById() es una funcion que ya tiene la libreria JPA
        Optional<User> user = userRepository.findById( id );
        return user.orElse( null );
    }

    @Override
    public User save( User user )
    {                       //save() es una funcion que ya tiene la libreria JPA
        return userRepository.save( user );
    }

    @Override
    public void delete( Integer id )
    {                  //deleteById() es una funcion d ela libreria JPA
        userRepository.deleteById( id );
    }
        //retorna el tipo de dato arreglo e forma de lista de tipo de dato USER
    public ArrayList<User> findByName(String name){
        return userRepository.findByName(name);
    }

}
