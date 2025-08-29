/*
C++, string is not a fundamental or built-in data type like int or char.
 Instead, it is part of the C++ Standard Library (under the std namespace)
  and is implemented as a class.*/
//************************************* */
// like java cpp have method substr
/*
Yes, C++ has a method for substrings, though it's not called substring—it's named substr,
 and it's a member function of the std::string class. 
 You can use it to extract a portion of a string.*/

#include<iostream>

using namespace std;

string substr(string str,int si,int ei)
{
    string newsub = "";

    for(int i=si;i<ei;i++)
    {
        newsub += str[i];
    }
    return newsub;
}
int main()
{ 
    string str= "savan sumbe";

    cout<<substr(str,2,4);


    cout<<str.substr(2,4);
    return 0;
}