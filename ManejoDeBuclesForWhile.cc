#include <iostream>
#include "stdio.h"
#include <stdlib.h>  
using namespace std;


void ejercicio1(int num){
    for (int i = 0; i < num; i++)
    {
        for (int j = 0; j < num; j++)
        {
            if (i>=j)
            {
                 cout<<"*";
            }
            
            
        }
        cout<<""<<endl;
        
    }
  
}
void ejercicio2(int num){
    string matriz [num][num]; 
    int aux =(sizeof(matriz)/sizeof(matriz[0]))-1;
   
    for (int i = 0; i < (sizeof(matriz)/sizeof(matriz[0])); i++)
    {
        for (int j = 0; j < (sizeof(matriz[0])/sizeof(matriz[0][0])); j++)
        {
            if(j>=aux){
               matriz[i][j]="*"; 
            }else{
                matriz[i][j]=" ";
            }
            cout<<matriz[i][j];
        }
        aux--;
        cout<<""<<endl;
        
    }
    
}

void ejercicio3 (int num){
string matriz [num][num]; 
    int aux =(sizeof(matriz)/sizeof(matriz[0]))-1;
    
    for (int i = 0; i < (sizeof(matriz)/sizeof(matriz[0])); i++)
    {
        for (int j = 0; j < (sizeof(matriz[0])/sizeof(matriz[0][0])); j++)
        {
            if(i%2==0){
                if(j%2==0){
                    matriz[i][j]="X"; 
                }else{
                    matriz[i][j]="0"; 
                }
            }
            else{
                if(j%2==0){
                    matriz[i][j]="0"; 
                }else{
                    matriz[i][j]="X"; 
                }
            }
            cout<<matriz[i][j];
        }
        cout<<""<<endl;
    }

}

void piramideAs(int num){
    int cont =1;
    int letra=65;
    while(cont != num+1){
    for (int i = 1; i <= (num-cont); i++)
        {
            cout<<" ";
        }
    for (int j = 1; j <= ((cont*2)-1); j++)
        {
            if(letra == 91){
                letra = 97;
            }
            if(letra >122){
                letra =65;
            }
         char a = letra;
            cout<<a;
            letra++;
        }
    cout<<" "<<endl;
    cont++;  
    }
      
}

void cuadrado (int num){
    string matriz [num][num];
    int aux =(sizeof(matriz)/sizeof(matriz[0]))-1;
    
    for (int i = 0; i < (sizeof(matriz)/sizeof(matriz[0])); i++)
    {
        for (int j = 0; j < (sizeof(matriz[0])/sizeof(matriz[0][0])); j++)
        {
            if(i==0){
                 matriz[i][j]="-"; 
            }
            else if(j == 0 && i != 0  && i<aux){
                matriz[i][j]="|"; 
            }
            else if( i == aux ){
                matriz[i][j]="-"; 
            }
            else if(j == aux && i!= aux){
                matriz[i][j]="|";
            }
            else{
                matriz[i][j]=" ";
            }
            cout<<matriz[i][j];
        }
        cout<<""<<endl;
    }
    
}


int main()
{   

    int num;
    cout<<"Ingrese un numero: ";cin>>num;
    ejercicio1(num);
    cout<<""<<endl;
    ejercicio2(num);
    cout<<""<<endl;
    ejercicio3 (num);
    cout<<""<<endl;
    piramideAs(num);
    cout<<""<<endl;
    cuadrado(num);
    system("pause");
    return 0;
}
