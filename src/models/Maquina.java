package models;

import java.util.HashSet;
import java.util.List;
import java.util.*;

public class Maquina implements Comparable<Maquina> {


    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riego;

    public Maquina(List<Integer> codigos, String ip, String nombre) {
        this.codigos = codigos;
        this.ip = ip;
        this.nombre = nombre;
    }
    

    private int calcularSubred(){
        String[] segmentos=ip.split("//.");
        if (segmentos.length==4) {
            try {
                return Integer.parseInt(segmentos[3]);
            } catch (NumberFormatException e) {
            return -1;
            }
        }
    }
    private int calcularRiesgo(){
        int sumaDiv3=0;
        for (int codigo : codigos) {
            if (codigo%3==0) {
                sumaDiv3+=codigo;
            }
        }
        set(Character) caracteresUnicos=new HashSet<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

  
    
}


