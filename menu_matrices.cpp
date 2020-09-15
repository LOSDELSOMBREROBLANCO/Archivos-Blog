#include <iostream>
#include <cstdlib>

using namespace std;

void MatrizTrans();

int main(){

    // Proyecto final
    // Bryan Vanegas
    // 17/07/2020

    int opc;

    do{
    cout << "\t\tBIENVENIDO\n" << endl;
    cout << "Menu de opciones >>\n" << endl;
    cout << "1) Suma de matrices mxn." << endl;
    cout << "2) Resta de matrices mxn." << endl;
    cout << "3) Multiplicacion de matrices mxn." << endl;
    cout << "4) Matriz transpuesta." << endl;
    cout << "5) Salir.\n" << endl;
    cout << "Ingrese su opcion: ";
    cin >> opc;

    switch(opc){

        case 1: {
            system("clear");

            int f,c;

            cout << "\nHa ingresado la opcion de Suma de matrices mxn\n" << endl;
            do{
                cout << "Ingrese el numero de filas: " ;
                cin >> f;
                cout << "Ingrese el numero de columnas: ";
                cin >> c;
                if(f<=0 || c<=0){
                    cout << "El valor ingresado no puede ser menor o igual a cero" << endl;
                }
            }while(f<=0 || c<=0);

            int a[f][c], b[f][c], sum[f][c];

            cout << "\nIngrese los elementos de la primera matriz: " << endl;
            for(int i = 0; i < f; ++i){
                for(int j = 0; j < c; ++j){
                    cout << "Ingrese el elemento a[" << i << "][" << j << "]: ";
                    cin >> a[i][j];
                }
            }
            cout << "\nIngrese los elementos de la segunda matriz: " << endl;
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
            cout << endl << "La suma de las matrices es:\n" << endl;
            for(int i = 0; i < f; ++i){
                for(int j = 0; j < c; ++j){
                    cout << sum[i][j] << " ";
                }
            cout << endl;
            }

            }break;

        case 2: {
            system("clear");
            int f,c;

            cout << "\nHa ingresado la opcion de Resta de matrices mxn\n" << endl;
            do{
                cout << "Ingrese el numero de filas: " ;
                cin >> f;
                cout << "Ingrese el numero de columnas: ";
                cin >> c;
                if(f<=0 || c<=0){
                        cout << "El valor ingresado no puede ser menor o igual a cero" << endl;
                    }
            }while(f<=0 || c<=0);

            int a[f][c], b[f][c], res[f][c];

            cout << "\nIngrese los elementos de la primera matriz: " << endl;
            for(int i = 0; i < f; ++i){
                for(int j = 0; j < c; ++j){
                    cout << "Ingrese el elemento a[" << i << "][" << j << "]: ";
                    cin >> a[i][j];
                }
            }
            cout << "\nIngrese los elementos de la segunda matriz: " << endl;
            for(int i = 0; i < f; ++i){
                for(int j = 0; j < c; ++j){
                    cout << "Ingrese el elemento b[" << i << "][" << j << "]: ";
                    cin >> b[i][j];
                }
            }
            for(int i = 0; i < f; ++i){
                 for(int j = 0; j < c; ++j){
                    res[i][j] = a[i][j] - b[i][j];
                }
            }
            cout << endl << "La Resta de las matrices es:\n" << endl;
            for(int i = 0; i < f; ++i){
                for(int j = 0; j < c; ++j){
                    cout << res[i][j] << " ";
                }
            cout << endl;
            }
            } break;

        case 3: {
            system("clear");
            int f,c,m,n;

            cout << "\nHa ingresado la opcion de Multiplicacion de matrices mxn\n" << endl;
            do{
                cout << "Ingrese el numero de filas de la primera matriz: " ;
                cin >> f;
                cout << "Ingrese el numero de columnas de la primera matriz: ";
                cin >> c;
                if(f<=0 || c<=0){
                    cout << "El valor ingresado no puede ser menor o igual a cero" << endl;
                }
            }while(f<=0 || c<=0);
            do{
                cout << "\nIngrese el numero de filas de la segunda matriz: " ;
                cin >> m;
                if (m!=c){
                    cout << "El numero de filas debe ser igual al numero de columnas de la primera matriz" << endl;
                }
            } while(m!=c);
            cout << "Ingrese el numero de columnas de la segunda matriz: ";
            cin >> n;


            int a[f][c], b[f][c], mul[f][c];

            cout << "\nIngrese los elementos de la primera matriz: " << endl;
            for(int i = 0; i < f; ++i){
                for(int j = 0; j < c; ++j){
                    cout << "Ingrese el elemento a[" << i << "][" << j << "]: ";
                    cin >> a[i][j];
                }
            }
            cout << "\nIngrese los elementos de la segunda matriz: " << endl;
            for(int i = 0; i < m; ++i){
                for(int j = 0; j < n; ++j){
                    cout << "Ingrese el elemento b[" << i << "][" << j << "]: ";
                    cin >> b[i][j];
                }
            }
            // Inicializamos la matriz mul
            for(int i=0; i<f; ++i){
                for(int j=0; j<n; ++j){
                    mul[i][j] = 0;
                }
            }

            // Generamos la matriz mul, resultados
            for(int i = 0; i < f; ++i){
                 for(int j = 0; j < n; ++j){
                    for(int k = 0; k < m; ++k){
                        mul[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // Impresion de la matriz resultante
            cout << endl << "La Multiplicacion de las matrices es:\n" << endl;
            for(int i=0; i<f; i++){
                for(int j=0; j<n; j++){
                    cout << mul[i][j] << " ";
                    }
                cout << endl;
                }
            cout << "\n\n";
            } break;

        case 4: {
            system("clear");
            cout << "\nHa ingresado la opcion de Matriz transpuesta\n" << endl;
            MatrizTrans();
            } break;

        case 5: {
            system("clear");
            cout << "\nHa ingresado la opcion Salir. " << endl;
            cout << "Gracias por usar este programa\n" << "Hasta la proxima" << endl;
            } break;

        default: {
            system("clear");
            cout << "\nHa ingresado una opcion incorrecta.\n\n" << endl;
            } break;
        }

    }while(opc!=5);

    return 0;
}


void MatrizTrans(){

    int f,c;
    cout << "Ingrese el numero de filas de la matriz: ";
    cin >> f;
    cout << "Ingrese el numero de columnas de la matriz: ";
    cin >> c;

    int a[f][c], trans[f][c];

    cout << "\nIngrese los elementos de la matriz: " << endl;
    for(int i=0; i<f; ++i){
        for(int j=0; j<c; ++j){
            cout << "Ingrese el elemento a[" << i << "][" << j << "]: ";
            cin >> a[i][j];
        }
    }

    for(int i=0; i<f; i++){
        for(int j=0; j<c; j++){
            trans[j][i]=a[i][j];
        }
    }

    cout << endl << "La matriz original es:\n" << endl;
    for(int i=0; i<f; i++){
        for(int j=0; j<c; j++){
            cout << a[i][j] << " ";
        }
    cout << endl;
    }

    cout << endl << "La matriz transpuesta es:\n" << endl;
    for(int i=0; i<c; i++){
        for(int j=0; j<f; j++){
            cout << trans[i][j] << " ";
        }
    cout << endl;
    }
    cout << "\n";
}
