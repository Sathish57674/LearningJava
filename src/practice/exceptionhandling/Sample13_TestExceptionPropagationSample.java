package practice.exceptionhandling;

public class Sample13_TestExceptionPropagationSample{

    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        Sample13_TestExceptionPropagationSample obj=new Sample13_TestExceptionPropagationSample();
        obj.p();
        System.out.println("normal flow...");
    }
}
