#include<iostream>

using namespace std;

int main(){
    int number,remainder,answer=0,mul=1;
    cout << "Enter the decimal number to find its binary equivalent :";
    cin >> number;

    while(number != 0){
        remainder = number % 2;
        number /= 2;
        answer = remainder * mul + answer;
        mul = mul * 10;
    }

    cout << "The binary equivalent is : " << answer;
}