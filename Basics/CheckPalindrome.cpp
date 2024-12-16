#include<iostream>

using namespace std;

int main(){
    int number,reverse=0,remainder,numcopy;
    cout << "Enter the number to check whether it's in palindrome :";
    cin >> number;
    numcopy = number;
    while(number!=0){
        remainder = number % 10;
        number = number / 10;
        reverse = reverse * 10 + remainder;
    }

    if(numcopy == reverse){
        cout << "The Number " << numcopy << " is a palindrome ";
    }
    else {
        cout <<"The number " << numcopy << " is not  a palindorme";
    }

}