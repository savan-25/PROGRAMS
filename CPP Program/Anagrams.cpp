//Anagram 
/*
It looks like you want to check if two strings are anagrams! An anagram is when two words or phrases have the same letters in the same frequency but arranged differently.

For example, "listen" and "silent" are anagrams because they contain the same letters.*/


#include<iostream>
#include<string>
using namespace std;

bool CheckAnagram(string s1,string s2)
{  
    bool bRet = true;
    if(s1.length() != s2.length())
    {
       return false;
    }
    for(int i=0;i<s1.length();i++)
    {   
        char ch  = s1[i];
        bool present = false;
        for(int j=0;j<s2.length();j++)
        {
          if(s1[i] == s2[j])
          {
            present = true;
            break;
          }
        }
        if(present==false)
        {
            bRet = false;
            break;
        }
    }

    return bRet;
}
int main()
{
     string str;
     cout<<"Enter the String : ";
     getline(cin,str);

     string str2;
     cout<<"Enter the String : ";
     getline(cin,str2);
    

     bool bRet = CheckAnagram(str,str2);

     if(bRet)
     {
        cout<<"Given String are Angrams";
     }else
     {
        cout<<"Given Strings are not Anagrams";
     }

    return 0;
}