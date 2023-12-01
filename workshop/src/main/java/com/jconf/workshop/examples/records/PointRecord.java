package com.jconf.workshop.examples.records;

public record PointRecord (int x, int y){

    //----- Long Constructor --------
    /*public PointRecord(int x, int y){
        if(x>9) throw new RuntimeException("Valor de x inválido");
        this.x = x;
        this.y = y;
    }*/

    //----- Compact Constructor --------
    /*public PointRecord{
        if(x>9) x = 9;
    }*/
}
