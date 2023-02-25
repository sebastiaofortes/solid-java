package com.sebastiaofortes.solidjava.violation;

import java.util.ArrayList;

public class LiskovSubstitution {

    public LiskovSubstitution() {

        Notas n = new Notas();
        n.ListaNotas.add(10);
        n.ListaNotas.add(11);
        n.ListaNotas.add(12);
        n.ListaNotas.add(13);

        ArrayList<Integer> r1 = n.FiltrarAbaixo(11);
        ArrayList<Integer> r2 = n.FiltrarAcima(11);

        System.out.println(r1);
        System.out.println(r2);

        n = new SubNotas();

        n.ListaNotas.add(10);
        n.ListaNotas.add(11);
        n.ListaNotas.add(12);
        n.ListaNotas.add(13);

        ArrayList<Integer> r3 = n.FiltrarAbaixo(11);
        ArrayList<Integer> r4 = n.FiltrarAcima(11);

        System.out.println(r3);
        System.out.println(r4);


    }

}

class Notas{
    public ArrayList<Integer> ListaNotas = new ArrayList<Integer>();

    public ArrayList<Integer> FiltrarAbaixo(Integer indice){
        var result = new ArrayList<Integer>();
        for(Integer i: this.ListaNotas){
            if(i < indice){
                result.add(i);
            }
        }
        return result;
    }

    public ArrayList<Integer> FiltrarAcima(Integer indice){
        var result = new ArrayList<Integer>();
        for(Integer i: this.ListaNotas){
            if(i > indice){
                result.add(i);
            }
        }
        return result;
    }

}

class SubNotas extends Notas{

    public ArrayList<Integer> FiltrarAbaixo(Integer indice){
        var result = new ArrayList<Integer>();
        for(Integer i: this.ListaNotas){
            if(i < indice){
                result.add(i);
            }
        }
        this.ListaNotas = result;
        return result;
    }

    public ArrayList<Integer> FiltrarAcima(Integer indice){
        var result = new ArrayList<Integer>();
        for(Integer i: this.ListaNotas){
            if(i > indice){
                result.add(i);
            }
        }
        this.ListaNotas = result;
        return result;
    }

}
