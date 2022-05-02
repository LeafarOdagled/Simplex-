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

        while ((((matrix[3][0]) <= 0) || ((matrix[3][1]) <= 0) || ((matrix[3][2]) <= 0) || ((matrix[3][3]) <= 0) || ((matrix[3][4]) <= 0) || ((matrix[3][5]) <= 0))) {

            if (Math.abs(matrix[3][0]) > Math.abs(matrix[3][1])) {
                //columna 0
                float n1 = 0, n2 = 0, n3 = 0, pivot = 0, auxPivot = 0, coeficiente = 0, coeficiente2 = 0, coeficiente3 = 0;
                int cont = 0, i = 0, j = 0;
                float res[] = new float[3];

                int aux = 0;
                for (i = 0; i <= 2; i++) {
                    res[cont] = matrix[i][5] / matrix[i][0];
                    cont++;
                }
                n1 = res[0];
                n2 = res[1];
                n3 = res[2];
                int comp = (int) comparar.menor(n1, n2, n3);
                //comp va a tener el dato de cual es la fila pivote 0 1 2 
                //sabemos que la columna es 0 
                pivot = matrix[comp][0];
                auxPivot = (float) Math.pow(pivot, -1);//esto lo usaremos para sacar el inverso del pivote

                for (j = 0; j <= 5; j++) {
                    //buscaremos hacer 1 al pivote 
                    matrix[comp][j] = matrix[comp][j] * auxPivot;// se busca multiplicar la fila pivote por su inverso
                }
                if (comp == 0) {
                    coeficiente = matrix[1][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 1,0

                        matrix[1][j] = (((coeficiente) * matrix[comp][j]) + matrix[1][j]);
                    }
                    coeficiente2 = matrix[2][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 2,0

                        matrix[2][j] = (((coeficiente2) * matrix[comp][j]) + matrix[2][j]);
                    }
                    coeficiente3 = matrix[3][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 3,0

                        matrix[3][j] = (((coeficiente3) * matrix[comp][j]) + matrix[3][j]);
                    }

                } else if (comp == 1) {
                    coeficiente = matrix[0][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 0,0

                        matrix[0][j] = (((coeficiente) * matrix[comp][j]) + matrix[0][j]);
                    }
                    coeficiente2 = matrix[2][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 2,0

                        matrix[2][j] = (((coeficiente2) * matrix[comp][j]) + matrix[2][j]);
                    }
                    coeficiente3 = matrix[3][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 3,0

                        matrix[3][j] = (((coeficiente3) * matrix[comp][j]) + matrix[3][j]);
                    }
                } else if (comp == 2) {

                    coeficiente = matrix[1][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 1,0

                        matrix[1][j] = (((coeficiente) * matrix[comp][j]) + matrix[1][j]);
                    }
                    coeficiente2 = matrix[0][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 2,0

                        matrix[0][j] = (((coeficiente2) * matrix[comp][j]) + matrix[0][j]);
                    }
                    coeficiente3 = matrix[3][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 3,0

                        matrix[3][j] = (((coeficiente3) * matrix[comp][j]) + matrix[3][j]);
                    }
                }

                System.out.println("a");

            } else {
                //columna 1
                float n1 = 0, n2 = 0, n3 = 0, pivot = 0, auxPivot = 0, coeficiente = 0, coeficiente2 = 0, coeficiente3 = 0;
                int cont = 0, i = 0, j = 0;
                float res[] = new float[3];

                for (i = 0; i <= 2; i++) {
                    res[cont] = matrix[i][5] / matrix[i][1];
                    cont++;
                }

                n1 = res[0];
                n2 = res[1];
                n3 = res[2];
                int comp = (int) comparar.menor(n1, n2, n3);
                //comp va a tener el dato de cual es la fila pivote 0 1 2 
                //sabemos que la columna es 1 
                pivot = matrix[comp][1];
                auxPivot = (float) Math.pow(pivot, -1);//esto lo usaremos para sacar el inverso del pivote

                for (j = 0; j <= 5; j++) {
                    //buscaremos hacer 1 al pivote 
                    matrix[comp][j] = matrix[comp][j] * auxPivot;// se busca multiplicar la fila pivote por su inverso
                }
                if (comp == 0) {
                    coeficiente = matrix[1][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 1,0

                        matrix[1][j] = (((coeficiente) * matrix[comp][j]) + matrix[1][j]);
                    }
                    coeficiente2 = matrix[2][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 2,0

                        matrix[2][j] = (((coeficiente2) * matrix[comp][j]) + matrix[2][j]);
                    }
                    coeficiente3 = matrix[3][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 3,0

                        matrix[3][j] = (((coeficiente3) * matrix[comp][j]) + matrix[3][j]);
                    }

                } else if (comp == 1) {
                    coeficiente = matrix[0][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 0,0

                        matrix[0][j] = (((coeficiente) * matrix[comp][j]) + matrix[0][j]);
                    }
                    coeficiente2 = matrix[2][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 2,0

                        matrix[2][j] = (((coeficiente2) * matrix[comp][j]) + matrix[2][j]);
                    }
                    coeficiente3 = matrix[3][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 3,0

                        matrix[3][j] = (((coeficiente3) * matrix[comp][j]) + matrix[3][j]);
                    }
                } else if (comp == 2) {

                    coeficiente = matrix[1][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 1,0

                        matrix[1][j] = (((coeficiente) * matrix[comp][j]) + matrix[1][j]);
                    }
                    coeficiente2 = matrix[0][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 2,0

                        matrix[0][j] = (((coeficiente2) * matrix[comp][j]) + matrix[0][j]);
                    }
                    coeficiente3 = matrix[3][0] * -1;
                    for (j = 0; j <= 5; j++) {
                        //para 3,0

                        matrix[3][j] = (((coeficiente3) * matrix[comp][j]) + matrix[3][j]);
                    }
                }
            }

        }
        return "";
    }
}
