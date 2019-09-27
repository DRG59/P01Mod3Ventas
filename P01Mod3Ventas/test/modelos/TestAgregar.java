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
public class TestAgregar {
    
        @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta=new Venta("1",500,1);
        ColeccionVentas instance=new ColeccionVentas();
        boolean esperado=true;
        boolean obtenido=instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
        
    }

    
}
