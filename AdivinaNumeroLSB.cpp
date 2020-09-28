#include <iostream>
#include <time.h>
#include <stdlib.h>

using namespace std;
int main(){

    int x,num,cont=0,a=0;
    srand(time(NULL));
    x=1+rand()%21;

    cout << "Adivina el numero entre 0 y 20.\nIntenta adivinarlo en pocos intentos, Suerte!" << endl;
    while (a==0){
        cout << "\nIntroduce numero: ";
        cin >> num;
        if (num<0 && num>20){
            cout << "El numero debe ser entre 0 y 20" << endl;
        }
        cont++;
        if(num>x){
            cout << "El numero es menor" << endl;
        }else if(num<x){
            cout << "El numero es Mayor" << endl;
        }else{
            cout << "\nGenial! Lo has adivinado en " << cont << " intentos.\n\n" << endl;
            a=1;
        }
    }
}

