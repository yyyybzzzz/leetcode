public class Solution {
    public List<Integer> getRow(int rowIndex) {
      List<List<Integer>>list=new ArrayList<List<Integer>>();
      List<Integer>l=new ArrayList<Integer>();
      l.add(1);
      list.add(l);
      if(rowIndex<=0){
        return list.get(0);
      }else{
        for(int i=1;i<=rowIndex;i++){
            l=new ArrayList<Integer>();
            l.add(1);
            for(int j=1;j<=i;j++){
                if(j==i){
                    l.add(1);
                }else{
                    l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
          }
          list.add(l);
        }
      }
      return list.get(rowIndex);
    }
}
