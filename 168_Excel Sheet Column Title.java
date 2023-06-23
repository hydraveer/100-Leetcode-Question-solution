

class Solution {
public:
    string convertToTitle(int n) {
        string res="";

       while(n>0){
           char c='A'+(n-1)%26;
           res=c+res;
           n=(n-1)/26;

       }
        return res;
    }
};
