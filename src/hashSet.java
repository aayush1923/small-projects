import java.util.HashMap;

public class hashSet {

static void findUnique(String input){

    HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
    int count=0;
    for(int i=0;i<input.length();i++){
        char c=input.charAt(i);
        if(hm.get(c)!=null && hm.get(c)>0){
            count=hm.get(c)+1;
            hm.put(c,count);

        }
        else{
            hm.put(c,1);
        }

    }
    for(int i=0;i<input.length();i++){
        char c=input.charAt(i);
        if(hm.get(c)==1){
            System.out.println(c);
            break;
        }
    }
}

    public static void main(String args[]) {
        String input="abrakadabra";
        findUnique(input);


    }
}