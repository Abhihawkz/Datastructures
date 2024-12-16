#include<iostream>

using namespace std;

bool isPrime(int n){
    if(n<=1){
        return 0;
    }
    for(int i=2; i<n; i++){
        if(n % i == 0){
            return 0;
        }
    }
    return 1;
}

int main(){
    int number;
    cout << "Enter the number untill which you need prime series : ";
    cin >> number;
    for( int i = 2; i<=number; i++){
        if(isPrime(i)){
            cout << i << " " ;
        }
    }
}