#include <iostream>
using namespace std;
int main() {

double sueldo,HorasTra,ValHora;
double TotalHora=0;

cout<<"Ingrese el valor a pagar por hora: "<<endl;
cin>>ValHora;

for(int i = 1; i <= 5; i++)
{
    cout<<"Ingrese el numero de horas trabajadas en el dia "<<i<<":"<<endl;
    cin>>HorasTra;
    TotalHora=TotalHora+HorasTra;
}
sueldo=TotalHora*ValHora;
cout<<"EL sueldo total a pagar es: "<<sueldo<<endl;

return 0;
}