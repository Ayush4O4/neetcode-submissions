class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int i=0;
        string word="";
        while(true){
            if(i>=strs[0].size()){
                return word;
            }
            char c=strs[0][i];
            bool flag=false;
            for(int j=1;j<strs.size();j++){
                if(c!=strs[j][i] || i>=strs[j].size()){
                    flag=true;
                    break;
                }
                
            }
            if(flag){
                return word;
            }
            word+=c;
            i++;
        }
    }
};