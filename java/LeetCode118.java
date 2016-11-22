public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<List<Integer>>();
         if(numRows<=0){
            return list;
        }
        List<Integer>l=new ArrayList<Integer>();
        l.add(1);
        list.add(l);
        for(int i=1;i<numRows;i++){
            l=new ArrayList<Integer>();
            l.add(1);
            for(int j=1;j<i;j++){
                l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            l.add(1);
            list.add(l);
        }
        return list;
    }
}