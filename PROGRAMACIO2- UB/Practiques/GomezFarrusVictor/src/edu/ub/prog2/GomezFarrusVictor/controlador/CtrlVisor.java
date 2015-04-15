/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.GomezFarrusVictor.controlador;

import edu.ub.prog2.GomezFarrusVictor.model.DadesVisor;
import edu.ub.prog2.utils.BasicCtrl;

/**
 *
 * @author mat.aules
 */
public class CtrlVisor extends BasicCtrl{
    private DadesVisor dadesVisor;
    
    public CtrlVisor(){
        
    }
    
    public DadesVisor getDades(){
        return dadesVisor;
    }
}
