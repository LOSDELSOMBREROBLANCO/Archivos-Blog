#include <iostream>
#include <cstdlib>

using namespace std;

int main(){

    // Suma de matrices
    // Bryan Vanegas
    // 08/07/2020

    int f,c;

    cout << "\t\tBIENVENIDO" << endl;
    cout << "Ingrese el numero de filas: " << endl;
    cin >> f;
    cout << "Ingrese el numero de columnas: " << endl;
    cin >> c;


    int a[f][c], b[f][c], sum[f][c];

    cout << "Ingrese los elementos de la primera matriz: " << endl;
    for(int i = 0; i < f; ++i){
        for(int j = 0; j < c; ++j){
            cout << "Ingrese el elemento a[" << i << "][" << j << "]: ";
            cin >> a[i][j];
        }
    }
    cout << endl << "Ingrese los elementos de la segunda matriz: " << endl;
    for(int i = 0; i < f; ++i){
        for(int j = 0; j < c; ++j){
            cout << "Ingrese el elemento b[" << i << "][" << j << "]: ";
            cin >> b[i][j];
        }
    }
    for(int i = 0; i < f; ++i){
         for(int j = 0; j < c; ++j){
            sum[i][j] = a[i][j] + b[i][j];
        }
    }
    cout << endl << "La suma de las matrices es: " << endl;
    for(int i = 0; i < f; ++i){
        for(int j = 0; j < c; ++j){
            cout << sum[i][j] << " ";
            if(j == c - 1)
            cout << endl;
        }
    }
    return 0;
}
