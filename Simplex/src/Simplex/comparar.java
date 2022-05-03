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
public class comparar {
    
    
    public static float menor(float n1, float n2, float n3){
        float menor=0;
        if (n1<n2){
            //System.out.println("pasa n1 de n1<n2");
            if (n1<n3){
            //    System.out.println("pasa n1 es menor que n2 y n3");
                menor = 0;//0,x
            }
        }else if (n2<n3){
            //System.out.println("pasa n2 es menor que n1 y que n3");
            menor =1;//1,x
        }else{
            //System.out.println("pasa n3 es menor que n2 y que n1");
            menor = 2;//2,x
        }
        
        return menor;
    }
    

}
