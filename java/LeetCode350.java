public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map1=new HashMap<Integer,Integer>();
        Map<Integer,Integer>map2=new HashMap<Integer,Integer>();
        for(int num:nums1){
            if(!map1.containsKey(num)){
                map1.put(num,0);
            }
            map1.put(num,map1.get(num)+1);
        }
        int size=0;
        for(int num:nums2){
            if(!map2.containsKey(num)&&map1.containsKey(num)){
                map2.put(num,0);
            }
            if(map1.containsKey(num)){
                size++;
                map2.put(num,map2.get(num)+1);
                if(map2.get(num).intValue()>map1.get(num).intValue()){
                    size--;
                    map2.put(num,map1.get(num));
                }
            }
        }
        int[]result=new int[size];
        int k=0;
        for(Integer i:map2.keySet()){
            for(int j=0;j<map2.get(i);j++){
                result[k]=i.intValue();
                k++;
            }
        }
        return result;
    }
}