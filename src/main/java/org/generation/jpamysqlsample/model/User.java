package org.generation.jpamysqlsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Se necesita crear una entidad por cadsa una de las tablas
@Entity(name = "Users")//Decimos que esta clase va a ser una representacion de lo que tengo en la base de datos
public class User
{
    @Id//Para indicar que este campo es un ID
    @GeneratedValue//Que sea autoincrementable
    private Integer id;//Tipo de dato integer para poder hacerlo autoincrementable

    private String name;
    //La notacion column me permite cambiar demasiadas caracteristicas de las columnas
    @Column(name = "last_name")//En la base de datos se va a llamar last_name
    private String lastName;

    private String email;

    public User()
    {
    }

    public User( String name, Integer id )
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }
}
