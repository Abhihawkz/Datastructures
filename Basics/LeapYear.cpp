#include<iostream>

using namespace std;

int main(){
    int year;
    cout << "Enter a year to find whether its a leap year or not:";
    cin >> year;

    if(year % 400 == 0){
        cout << year << " is a Leap year";
    }else if( year % 4 == 0 && year % 100 != 0){
        cout <<  year << " is a Leap year";
    }else {
        cout << year << " is not a leap year ";
    }
}