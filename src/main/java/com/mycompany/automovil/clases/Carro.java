/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.clases;

import com.mycompany.automovil.automovil.enumeracion.Color;
import com.mycompany.automovil.automovil.enumeracion.TipoCombustible;
import com.mycompany.automovil.automovil.enumeracion.tipoAutomovil;


/**
 *
 * @author anaaw
 */
public class Carro {
    private String marca;
    private int modelo;
    private int motor;
    private TipoCombustible tipoCombustible;
    private tipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private double velocidadMaxima;
    private Color color;
    private double velocidadActual=0;
    
    //constructores
    public Carro(String marca, int modelo, int motor, TipoCombustible tipoCombustible,tipoAutomovil tipoAutomovil,int numeroPuertas,int cantidadAsientos,double velocidadMaxima,Color color,double velocidadActual){
        
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    // metodos get y set
     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(tipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    //Metodo para hacelerar
    public void acelerar (double velocidad){
        if (velocidadActual+velocidad < velocidadMaxima) {
            velocidadActual = velocidadActual + velocidad;
            System.out.println("La velocidad acelerada es de: " + velocidadActual);
        } else {
            System.out.println("no se puede  acelerar mas allá de la velocidad maxima");
        }
    }
    //Metodos para desacelerar
    public void desacelerar (double velocidad){
        if (velocidadActual - velocidad >0) {
            velocidadActual = velocidadActual - velocidad;
            System.out.println("La velocidad desacelerada: "+velocidadActual);
        } else {
            System.out.println("No se puede desacelerar a una velocidad negativa ");
        }
    }
       public void frenar(){
          // velocidadActual= 0;
           System.out.println("La velocidad de frenado es 0 ");
       } 
    //metodo para calcular el tiempo
       public double calcularTiempoLlegada (double distancia){
           System.out.println("con Velocidad: "+velocidadActual);
               return distancia/velocidadActual;
       }
    //Metodos para mostrar loa atributos del Automovil
       public void imprimir(){
           System.out.println("marca :"+marca);
           System.out.println("modelo:"+modelo);
           System.out.println("motor:"+motor);
           System.out.println("TipoCombustible:"+tipoCombustible);
           System.out.println("TipoAutomovil:"+tipoAutomovil);
           System.out.println("numeroPuertas:"+numeroPuertas);
           System.out.println("CantidadAsientos:"+cantidadAsientos);
           System.out.println("VelocidadMaximas:"+velocidadMaxima);
           System.out.println("Color:"+color);
           System.out.println("VelocidadActual:"+velocidadActual);
       }
     //metodos probrar velocidad en km
      /* public void probarVelocidad(){
           System.out.println("velocidad Actual:"+velocidadActual +"km");
       }
       */
}
