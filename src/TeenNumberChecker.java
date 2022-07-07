public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three){
        if ((one <=19 || two<=19  || three<=19 )  && (one>=13 || two>=13 || three>=13)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int param){
        if(param>=13 && param<=19){
            return true;
        }else{
            return false;
        }
    }
}
