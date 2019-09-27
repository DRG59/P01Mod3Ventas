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
public class TestEliminar {

    @Test
    public void testEliminar() {
        System.out.println("Elimnar");
        String codigo = "150";
        Venta venta = new Venta("150", 800, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);

    }

}
