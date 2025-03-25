package week5;


public class Power26 {
    int baseNumber;
    int exponent;
    Power26(int n, int e){
      baseNumber = n;
      exponent = e;

 }         
 int PowerBF(int n, int e){
    int result = 1;
    for(int i = 0; i < e; i++){
        result = result * n;
    }
    return result;
 } 
 int PowerBF(int n, int e);
  if(e==1){
    return n;
  }else{
    if (e%2==1) {
        return n;
    }
  }               
}
