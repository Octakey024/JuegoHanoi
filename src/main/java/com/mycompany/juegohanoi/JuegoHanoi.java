/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.juegohanoi;

import java.util.Scanner;

public class JuegoHanoi {


        public static void moverDiscos(int numDiscos, char torreOrigen, char torreDestino, char torreAuxiliar) {
            if (numDiscos == 1) {
                System.out.println("Mover disco 1 desde la torre " + torreOrigen + " a la torre " + torreDestino);
                return;
            }
            moverDiscos(numDiscos - 1, torreOrigen, torreAuxiliar, torreDestino);
            System.out.println("Mover disco " + numDiscos + " desde la torre " + torreOrigen + " a la torre " + torreDestino);
            moverDiscos(numDiscos - 1, torreAuxiliar, torreDestino, torreOrigen);
        }


        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("¿Cuál es tu cantidad de torres que quieres crear?");
            System.out.println("------------------------------------------------------------");
            System.out.println("Nota, si tu PC no es gamer, no agregar más de 100");
            int numDiscos = leer.nextInt();
            char torreOrigen = 'A';
            char torreDestino = 'C';
            char torreAuxiliar = 'B';

            moverDiscos(numDiscos, torreOrigen, torreDestino, torreAuxiliar);
        }
    }

