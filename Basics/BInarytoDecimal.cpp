#include<iostream>

using namespace std;

int main(){
    int number,mul=1,answer=0,remainder;
    cout << "Enter the binary number to find its decimal equivalent : ";
    cin >> number;
    while(number != 0){
        remainder = number % 10;
        number /= 10;
        answer = remainder * mul + answer;
        mul = mul * 2;
    }

    cout << "The Decinal equivalent is : " << answer;
}