//finding duplicate values//
public class array6 {
    public static  void main(String[] args){
        int num[]={1,2,3,1,4,5,2};
        for(int i=0; i<num.length; i++)
        {
            for (int j=i+1; j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.println("the duplicate element is :" +num[i]);
                    break;
                }
            }
        }
    }

}
