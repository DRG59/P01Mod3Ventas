/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ANDROID
 */
public class TestModificar {

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = new Venta("1", 120000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = false;
        venta = new Venta("2", 121000, 3);
        boolean obtenido = instance.modificar(venta);
        Assert.assertEquals(esperado, obtenido);

    }

}
