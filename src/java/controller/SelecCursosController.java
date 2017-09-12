/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.SelecCursosBean;

public class SelecCursosController {
    private SelecCursosBean datosCursos;

    public SelecCursosBean getDatosCursos() {
        return datosCursos;
    }

    public void setDatosCursos(SelecCursosBean datosCursos) {
        this.datosCursos = datosCursos;
    }
    
    public String grabarDatosCursos(){
        return "ok";
    }
}
