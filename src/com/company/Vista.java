package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vista {

    public static void main(String[] args) {
        int i=-1,lvlPok=0;
        Etakemon pokemon=new Etakemon();
        Controlador1 control =new Controlador1();
        Scanner leer =new Scanner(System.in);
        List<Etakemon> lista;
        while (i!=5)
        {

            System.out.println("1. Add pokemon");
            System.out.println("2. Remove from ID");
            System.out.println("3. Show Pokedex");
            System.out.println("4. Search by name");
            System.out.println("5. Close");
            i=Integer.parseInt(leer.nextLine());
            switch (i)
            {
                case 1:

                    System.out.println("name:");
                    pokemon.nombre=leer.nextLine();
                    System.out.println("lvl:");
                    lvlPok=Integer.parseInt(leer.nextLine());
                    pokemon.lvl=lvlPok;
                    if(control.AddPokemon(pokemon))
                        System.out.println("Success");
                    else
                        System.out.println("Error");
                    break;
                case 2:
                    System.out.println("ID:");
                    if(control.RemovePokemon(Integer.parseInt(leer.nextLine())))
                        System.out.println("Success");
                    else
                        System.out.println("Error");
                    break;
                case 3:
                    lista=new ArrayList<>();
                    lista=control.show();
                    for(int k=0;k<lista.size();k++)
                    {
                        pokemon= lista.get(k);
                        System.out.println("Id:"+pokemon.id+"  Nombre: "+pokemon.nombre+"  Lvl:"+pokemon.lvl);
                    }
                    break;
                case 4:
                    String s;
                    lista=new ArrayList<>();
                    System.out.println("introduce the name for the pokemon");
                    s=leer.nextLine();
                    lista=control.Searcg(s);
                    for(int k=0;k<lista.size();k++)
                    {
                        pokemon= lista.get(k);
                        System.out.println("Id:"+pokemon.id+"  Name: "+pokemon.nombre+"  Lvl:"+pokemon.lvl);
                    }
                    break;
                case 5:System.out.println("cya");
                    break;
            }


        }

    }
}





