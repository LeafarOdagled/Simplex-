/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simplex;

/**
 *
 * @author rafin
 */
import java.lang.Math;

public class maxi {

    float matrix[][];

    public maxi(float matrix[][]) {
        this.matrix = matrix;
    }
    public String max() {
        if (matrix[3][0] > matrix[3][1]) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 6; j++) {
                    //float mayor=0;
                    float res[] = new float[3];
                    int cont = 0;
                    if (cont <= 2) {
                        res[cont] = matrix[i][3] / matrix[i][0];
                        cont++;
                    }
                    float n1 = 0, n2 = 0, n3 = 0, pivot = 0, auxPivot = 0, coeficiente = 0, coeficiente2 = 0, coeficiente3 = 0;
                    n1 = res[0];
                    n2 = res[1];
                    n3 = res[2];
                    //pivote es el valor del pivote
                    if (n1 < n2) {
                        if (n1 < n3) {
                            pivot = matrix[0][0];
                            auxPivot = (float) Math.pow(pivot, -1);//esto es para conseguir el numero opuesto al pivote
                            matrix[0][j] = matrix[0][j] * auxPivot;
                            coeficiente = matrix[1][0];
                            matrix[1][j] = ((coeficiente * -1) * (matrix[0][j])) + matrix[1][j];
                            coeficiente2 = matrix[2][0];
                            matrix[2][j] = ((coeficiente2 * -1) * (matrix[0][j])) + matrix[2][j];
                            coeficiente3 = matrix[3][0];
                            matrix[3][j] = ((coeficiente3 * -1) * (matrix[0][j])) + matrix[3][j];
                        }
                    } else if (n2 < n3) {
                        pivot = matrix[1][0];
                        auxPivot = (float) Math.pow(pivot, -1);//esto es para conseguir el numero opuesto al pivote
                        matrix[1][j] = matrix[1][j] * auxPivot;
                        coeficiente = matrix[0][0];
                        matrix[0][j] = ((coeficiente * -1) * (matrix[1][j])) + matrix[0][j];
                        coeficiente2 = matrix[2][0];
                        matrix[2][j] = ((coeficiente2 * -1) * (matrix[1][j])) + matrix[2][j];
                        coeficiente3 = matrix[3][0];
                        matrix[3][j] = ((coeficiente3 * -1) * (matrix[1][j])) + matrix[3][j];
                    } else {
                        pivot = matrix[2][0];
                        auxPivot = (float) Math.pow(pivot, -1);//esto es para conseguir el numero opuesto al pivote
                        matrix[2][j] = matrix[2][j] * auxPivot;
                        coeficiente = matrix[0][0];
                        matrix[0][j] = ((coeficiente * -1) * (matrix[2][j])) + matrix[0][j];
                        coeficiente2 = matrix[1][0];
                        matrix[1][j] = ((coeficiente2 * -1) * (matrix[2][j])) + matrix[1][j];
                        coeficiente3 = matrix[3][0];
                        matrix[3][j] = ((coeficiente3 * -1) * (matrix[2][j])) + matrix[3][j];
                    }
                }
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    //float mayor=1;
                    float res[] = new float[3];
                    int cont = 0;
                    if (cont <= 2) {
                        res[cont] = matrix[i][3] / matrix[i][0];
                        cont++;
                    }
                    float n1 = 0, n2 = 0, n3 = 0, pivot = 0, auxPivot = 0, coeficiente = 0, coeficiente2 = 0, coeficiente3 = 0;
                    n1 = res[0];
                    n2 = res[1];
                    n3 = res[2];
                    //pivote es el valor del pivote
                    if (n1 < n2) {
                        if (n1 < n3) {
                            pivot = matrix[0][1];
                            auxPivot = (float) Math.pow(pivot, -1);//esto es para conseguir el numero opuesto al pivote
                            matrix[0][j] = matrix[0][j] * auxPivot;
                            coeficiente = matrix[1][1];
                            matrix[1][j] = ((coeficiente * -1) * (matrix[0][j])) + matrix[1][j];
                            coeficiente2 = matrix[2][1];
                            matrix[2][j] = ((coeficiente2 * -1) * (matrix[0][j])) + matrix[2][j];
                            coeficiente3 = matrix[3][1];
                            matrix[3][j] = ((coeficiente3 * -1) * (matrix[0][j])) + matrix[3][j];
                        }
                    } else if (n2 < n3) {
                        pivot = matrix[1][1];
                        auxPivot = (float) Math.pow(pivot, -1);//esto es para conseguir el numero opuesto al pivote
                        matrix[1][j] = matrix[1][j] * auxPivot;
                        coeficiente = matrix[0][1];
                        matrix[0][j] = ((coeficiente * -1) * (matrix[1][j])) + matrix[0][j];
                        coeficiente2 = matrix[2][1];
                        matrix[2][j] = ((coeficiente2 * -1) * (matrix[1][j])) + matrix[2][j];
                        coeficiente3 = matrix[3][1];
                        matrix[3][j] = ((coeficiente3 * -1) * (matrix[1][j])) + matrix[3][j];
                    } else {
                        pivot = matrix[2][1];
                        auxPivot = (float) Math.pow(pivot, -1);//esto es para conseguir el numero opuesto al pivote
                        matrix[2][j] = matrix[2][j] * auxPivot;
                        coeficiente = matrix[0][1];
                        matrix[0][j] = ((coeficiente * -1) * (matrix[2][j])) + matrix[0][j];
                        coeficiente2 = matrix[1][1];
                        matrix[1][j] = ((coeficiente2 * -1) * (matrix[2][j])) + matrix[1][j];
                        coeficiente3 = matrix[3][1];
                        matrix[3][j] = ((coeficiente3 * -1) * (matrix[2][j])) + matrix[3][j]; 
                    }
                }
            }
        }
        return " ";
    }
}
