#include <iostream>
using namespace std;

class Employee
{
    int id;
    static int count;

    public:
    void setdata()
    {
        cout<<"Enter the  id\n";
        cin>>id;
        count++;
    }
    void getdata()
    {
        cout<<"id of This Employee is: "<<id<<"and Employee Number is: "<<count<<endl;
    }
    static void getcount()
    {
        cout<<"the Value of count is: "<<count<<endl;
    }
};
int Employee :: count;//it by default 0 ,but as we need it initilize with other value
int main(){

    Employee S1,S2,S3;

    S1.setdata();
    S1.getdata();
    Employee::getcount();

     S2.setdata();
    S2.getdata();
    Employee::getcount();

     S3.setdata();
    S3.getdata();
    Employee::getcount();
    
    return 0;
}