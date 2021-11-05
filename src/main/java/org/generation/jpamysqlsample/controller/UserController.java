package org.generation.jpamysqlsample.controller;


import org.generation.jpamysqlsample.model.User;
import org.generation.jpamysqlsample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin( "*" )
@RestController//ESTEREOTIPO DE SPRING QU EINDICA QUE VA A SER UN CONTROLADOR DE TIPO REST ES DECIR VA A ESCUCHAR PETICIONES HTTP
public class UserController
{
                        //Se inyecta una dependencia de tipo service
    public UserController( @Autowired UserService userService )
    {
        this.userService = userService;
    }

    private final UserService userService;
    //Cuando se ejecuta esta operacion obetiene la peticion http por el metodo get y la informacion se muestra por la ruta /user/{id}
    @GetMapping( "/user/{id}" )
    //Se dispara este metodo
    public User getUser( @PathVariable Integer id )
    {
        //Retorna este valor        //Introduce el id como parametro para poder obtener la informacion y la retorna en un objeto de tipo User
        return userService.getUser( id );
    }
    //Metodo Http POST, la informacion se va a mandar a traves de la ruta indicada
    @PostMapping( "/user" )
                        //Con el resquestbody decimos que necesitamos obtener la informacion que viaja en el cuerpo de la peticion
    public User newUser( @RequestBody User user )
    {                   //Retorna la informacion en un objeto
        return userService.save( user );
    }

    @PutMapping( "/user" )
    public User updateUser( @RequestBody User user )
    {
        return userService.save( user );
    }

    @DeleteMapping( "/user/{id}" )
    public void deleteUser( @PathVariable Integer id )
    {
        userService.delete( id );
    }

    @GetMapping( "/user/search/{name}" )
    public ArrayList<User> findByName(@PathVariable String name){
        return userService.findByName(name);
    }
}
