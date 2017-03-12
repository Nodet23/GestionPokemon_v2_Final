package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nodet on 23/02/2017.
 */
public class Controlador1 {
    List<Etakemon> Pokedex = new ArrayList<Etakemon>(10);

    private int iID =0;
    public boolean AddPokemon(Etakemon e)
    {
        boolean ans;
        e.id = iID;
        iID++;
        ans=Pokedex.add(e);
        return ans;
    }
    public List<Etakemon> show()
    {
        return Pokedex;
    }

    public List<Etakemon> Searcg(String s)
    {
        List<Etakemon> f=new ArrayList<>();
        Etakemon e =new Etakemon();
        for(int i=0;i<Pokedex.size();i++)
        {
            e=Pokedex.get(i);
            if(e.nombre.equals(s))
                f.add(e);
        }
        return f;
    }

    public boolean RemovePokemon(int i)
    {
        boolean ans=false;
        Etakemon e=new Etakemon();
        for(int j=0;j<Pokedex.size();j++)
        {
            e=Pokedex.get(j);
            if(e.id==i)
            {
                Pokedex.remove(j);
                ans=true;
                break;
            }
        }
        return ans;
    }



}


