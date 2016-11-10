public class Solution {
    public List<String> readBinaryWatch(int num) {
        int max=0;
        int min=0;
        List<String>list=new ArrayList<String>();
        if(num>8){
            return list;
        }
       for(int i=0;i<num;i++){
           min+=Math.pow(2,i);
           max+=Math.pow(2,9-i);
       }
       for(int i=min;i<=max;i++){
           int h=(i>>6)&15;
           int m=i&63;
           if(h>11||m>59){
               continue;
           }else if(get1(h,4)+get1(m,6)==num){
               String time="";
               if(m<10){
                   time=h+":0"+m;
               }else{
                   time=h+":"+m;
               }
               list.add(time);
           }
       }
       return list;
    }
    public int get1(int num,int len){
        int count=0;
        for(int i=0;i<len;i++){
            if((num>>i&1)==1){
                count++;
            }
        }
        return count;
    }
}