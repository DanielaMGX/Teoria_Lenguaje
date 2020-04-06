package practica_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;

/**
 *
 * @author danii
 */
public class Automata {
    
    private final Automaton aF;
    private final RegExp exp;
    private String[] namStates;

    public Automata(String eR) {
        
        exp = new RegExp(eR);
        aF = exp.toAutomaton();
        

    }

    public Automaton getaF() {
        return aF;
    }

    public RegExp getExp() {
        return exp;
    }
    
    public boolean run (String s)
    {
        boolean aceppt = aF.run(s);
        return aceppt;
    }
    
    public String mostrarAF(){
        return aF.toString();
    }
    
    
    
}
