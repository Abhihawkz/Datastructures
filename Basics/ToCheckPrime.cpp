#include<iostream>

using namespace std;

bool isPrime(int n ){
    if(n<=1){
        return 0;
    }
    for(int i = 2; i<n; i++){
        if(n % i == 0){
            return 0;
        }
    }
    return 1;
}


int main(){
    int number;
    cout <<"Enter the number to check whether its prime or not :";
    cin >> number;
    if(isPrime(number)){
        cout << number << " is a prime number";
    }else {
        cout << number << " is not a prime number ";
    }
}