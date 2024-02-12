public class Triangle {

    int a ;
    int b ;
    int c ;

    public  void getArea(int a,int b ,int c){
        int p = (a+b+c)/2;
        System.out.print("Area  : "+ Math.sqrt(p * (p - a) * (p - b) * (p - c)));


    }
}
