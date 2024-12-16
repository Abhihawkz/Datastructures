#include<iostream>

using namespace std;

int main(){
    int number,remainder,answer=0;
    cout << "Enter an integer to reverse: ";
    cin >> number;

    while ( number > 0){
        remainder = number % 10;
       number /= 10;
        answer = answer * 10 + remainder; 
    }
    cout << "The reversed integer is : " << answer;
}