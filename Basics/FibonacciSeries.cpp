#include<iostream>

using namespace std;

int main(){
    int number;
    cout << "Enter the number until which you need fibonacci series : ";
    cin >> number;
    int first = 0,second = 1,next;
    for(int i = 0; i<number; i++){
        if(i<2){
            cout << i << " ";
        }else {

        next = first + second;
        cout << next << " ";
        first = second;
        second = next;
        }
    }
}