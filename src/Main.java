public class Main {
    public static void main(String[] args) {
       int VarA=15;
        System.out.println(++VarA);
       int VarB= VarA;

        System.out.println(VarB);
if( VarB % 2!=0 && (VarB*(VarB+1)) %3==0){
    System.out.println("Both statements are true");
}else {
    System.out.println("One or both statements are false");
}
        
    }
}