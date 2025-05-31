/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovil;
import com.mycompany.automovil.automovil.enumeracion.Color;
import com.mycompany.automovil.automovil.enumeracion.TipoCombustible;
import com.mycompany.automovil.automovil.enumeracion.tipoAutomovil;
import com.mycompany.automovil.clases.Carro;


/**
 *
 * @author anaaw
 */
public class Automovil  {

    public static void main(String[] args) {
    Carro c = new Carro("Ford", 2025, 10, TipoCombustible.BIODIESEL, tipoAutomovil.COMPACTO, 6, 8, 205, Color.ROJO, 100.1);
    c.imprimir();
    c.acelerar(20);
    c.desacelerar(50);
    c.frenar();
   System.out.println("El tiempo "+c.calcularTiempoLlegada(10));
   }
    
}
