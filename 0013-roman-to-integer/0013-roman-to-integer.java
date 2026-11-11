class Solution {
    public int romanToInt(String s) {
        int num=0 ;
        for(int i =s.length()-1 ;i>=0;i--){
            char t = s.charAt(i);
            char y = 'x';
            if(i!= 0){
              y=s.charAt(i-1);  
            }           
            if(t=='M'){
                if(y=='C'){num=num+900;i=i-1;}
                else{num=num+1000;}
            }
            else if (t=='D'){
                if(y=='C'){num=num+400;i=i-1;}
                else{num=num+500;}
            }
            else if (t=='C'){
                if(y=='X'){num=num+90;i=i-1;}
                else{num=num+100;}
            }
            else if (t=='L'){
               if(y=='X'){num=num+40;i=i-1;}
                else{num=num+50;}
            }
            else if(t=='X'){
                if(y=='I'){num=num+9;i=i-1;}
                else{num=num+10;}
            }
            else if(t=='V'){
                if(y=='I'){num=num+4;i=i-1;}
                else{num=num+5;}
            }
            else if(t=='I'){
                num=num+1;
            }
        }
        return num;
        
    }
}