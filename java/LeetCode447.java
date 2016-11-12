public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        Map<Long,Integer>map;
        int count=0;
        Long d1;
        for(int i=0;i<points.length;i++){
            map=new HashMap<Long,Integer>();
            for(int j=0;j<points.length;j++){
                d1=distance(points[i],points[j]);
                if(!map.containsKey(d1)){
                    map.put(d1,0);
                }
                map.put(d1,map.get(d1)+1);
            }
            for(Long key:map.keySet()){
                int n=map.get(key);
                if(n>=2){
                    count+=((n-1)*n);
                }
            }
        }
        return count;
    }
    public Long distance(int[]i,int[]j){
        return Math.round(Math.pow(i[0]-j[0],2)+Math.pow(i[1]-j[1],2));
    }
}