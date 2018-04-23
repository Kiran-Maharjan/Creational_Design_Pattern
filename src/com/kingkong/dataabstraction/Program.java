/*
structural design patterns are concerned with how classes and objects can be composed
, to form larger structures.

The structural design patterns simplifies the structure by identifying the 
relationships.


These patterns focus on, how the classes inherit from each other and how they are 
composed from other classes.
*/
/*
** *****************kiranmaharjan8888@gmail.com

 */
package com.kingkong.dataabstraction;

import com.kingkong.dataabstraction.command.AddCommand;
import com.kingkong.dataabstraction.command.MathCommand;
import com.kingkong.dataabstraction.command.MathCommandFactory;
import com.kingkong.dataabstraction.command.MathContext;
import com.kingkong.dataabstraction.command.SubCommand;

/**
 *
 * @author kiran
 */
public class Program {

    public static void main(String[] args) {

        double x = 2, y = 3;
        
        MathContext  ctx=new MathContext(new AddCommand());
        //--it is also a dependency injection, inversion of control
        //MathCommand cmd=MathContext;
        System.out.println(ctx.doOperation(x, y));
    }
}
