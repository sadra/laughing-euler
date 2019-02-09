//#pb-9
public class HelloWorld{
  public static void main(String []args){
    long startTime = System.nanoTime();
    System.out.println(specialPythagoreanTriplet(1000));
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Execution time in microseconds : " + timeElapsed / 1000);
  }
  public static int specialPythagoreanTriplet(int n){
    int p=0;
    for(int a=1;a<=n;a++){
      for(int b=1;b<=n;b++){
        for(int c=1;c<=n;c++){
          if(a+b+c ==n && (a*a + b*b == c*c)){
            p= a*b*c;
          }    
        }
      }
    }
    return p;
  }    
}  
    
