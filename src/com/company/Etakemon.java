package com.company;

/**
 * Created by Nodet on 23/02/2017.
 */
public class Etakemon {
    public String nombre;
    private static int numeroPokemon =0;
    public int id;

    public int lvl;

    public Etakemon(){

//        numeroPokemon++;
        Etakemon.setNumeroPokemon(numeroPokemon+1); // no puedo poner ++; en el argumento sino BOOM
        this.id=Etakemon.numeroPokemon;

    }

    public Etakemon (String nombre, int lvl)
    {

        this.lvl = lvl;
        this.nombre=nombre;
        numeroPokemon++;
        id=numeroPokemon;

    }

    public Etakemon(String nombre){

        this.nombre=nombre;
        numeroPokemon++;
        id=numeroPokemon;  // aqui no pongo ++ xq no necesito qwe suba, sera el mismo SEMPRE
    }

    /*public String getNombre() {
        return nombre;

    }*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getNumeroPokemon() {
        return numeroPokemon;
    }

    public static void setNumeroPokemon(int numeroPokemon) {
        Etakemon.numeroPokemon = numeroPokemon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
