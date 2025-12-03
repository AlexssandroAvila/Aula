/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.operações;

import br.edu.operações.OperaçõesMatematicas;

/**
 *
 * @author Alexssandro Ávila
 */
public class Divisão extends OperaçõesMatematicas {
    @Override
    public double calcular(double a, double b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Divisao por zero nao e permitida.");
        }
        return a / b;
    } 
}
