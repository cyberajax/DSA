class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> x  = new ArrayList <>();
        for ( int i = 0 ; i < numRows ; i ++)
        {
            List<Integer> r = new ArrayList<>();
            if(i==0)
            {r.add(1);}
           
            else{
                for (int j = 0 ; j<= i ;j++)
                {
                    if ( j == 0 || j==i){
                        r.add(1);
                    } 
                    else 
                    {
                        int temp = x.get(i-1).get(j) + x.get(i-1).get(j-1);
                        r.add(temp);
                    }  
                }
                
                
            }
            x.add(r);
            
        }
        
        return x ;
    }
}