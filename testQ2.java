public class testQ2 {
    public static void main(String args[]){
        String s="leetcode";
        System.out.println("Given string is:" +s);
        int index= nonRepeat(s);
        if(index != -1){
            System.out.println("First non repeating character is at index: " + index);
            System.out.println("Character:" +s.charAt(index));
        }
        else{
            System.out.println("There is no non repeatin character");
        }
    
    }
    public static int nonRepeat(String s){
        int count[]=new int [50];
        int n=s.length();
          for(int i=0;i<n;i++){
            char c=s.charAt(i);
            count[c-'a']++;
        }
      
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(count[c-'a']==1){
                return i;
            }
        }
        return -1;

    }
    
}
