#include<iostream>

using namespace std;

int main(){
    int number;
    cout <<"Enter the digits to get its sum : ";
    cin >> number;

    while(number > 9 ){
        int answer=0, remainder;
        while(number != 0){
            remainder = number % 10;
            number /= 10;
            answer +=remainder;
        }
        number = answer;
    }

    cout << "The sum of the digits are : " << number;
}