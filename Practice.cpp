
#include<iostream> 
#include <ctype.h> 
#include<string.h> 
using namespace std; 
int main()  
{ 
  char str[20]; 
  int length = 0; 
  cout<<"Enter a string: "; 
  cin>>str; 
  length = strlen(str); 
  for(int i=0;i<length;i++) 
  { 
      if(i==0||i==(length-1)) 
      { 
          str[i]=toupper(str[i]); 
      } 
      // else if(str[i]==' ')  
      // { 
      //     str[i-1]=toupper(str[i-1]); 
      //     str[i+1]=toupper(str[i+1]); 
      // } 
  } 
  cout<<"After conversion of first and last letter to uppercase: "<<str; 
  return 0; 
}