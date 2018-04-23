/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.command;

/**
 *
 * @author kiran
 */
public class MathContext {
    private MathCommand cmd;
    
    public MathContext(MathCommand cmd){
    this.cmd=cmd; //--confict occur for same local and class variable
    }
    
    public  double doOperation(double x, double y){
        return cmd.calculate(x, y);
        
    }
    
}
