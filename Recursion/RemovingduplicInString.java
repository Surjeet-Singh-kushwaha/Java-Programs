public class RemovingduplicInString {
    static void removeDuplicate(String str, int index , StringBuilder newStr, boolean map[]){
  if(index == str.length()){
    System.out.println(newStr);
    return;
  }
  char ch = str.charAt(index);
  if(map[ch-'a']==true){
    removeDuplicate(str, index+1, newStr, map);
  }
  else{
   map[ch-'a']=true;
   removeDuplicate(str, index+1, newStr.append(ch), map);
  }
    }
    public static void main(String[] args) {
        String str = "ssurjeejhslffsgks";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
