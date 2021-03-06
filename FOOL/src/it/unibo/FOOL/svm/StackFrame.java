/*
 * An bytecode compiler and interpreter for FOOL+ language in Java/ANTLR
 * 
 * Course project for COMPILATORI E INTERPRETI (ANALISI STATICA DI PROGRAMMI)
 * Copyright(R) 2017  Chun Tian, University of Bologna
 */

package it.unibo.FOOL.svm;

/***
 * Excerpted from "Language Implementation Patterns", published by The Pragmatic
 * Bookshelf. Copyrights apply to this code. It may not be used to create
 * training material, courses, books, articles, and the like. Contact us if you
 * are in doubt. We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book
 * information.
 ***/

public class StackFrame {
    Function sym;      // associated with which function?
    int returnAddress; // the instruction following the call
    Object[] locals;   // holds parameters and local variables

    public StackFrame(Function sym, int returnAddress) {
	this.sym = sym;
	this.returnAddress = returnAddress;
	locals = new Object[sym.nargs + sym.nlocals];
    }
}
