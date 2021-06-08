public class Manipulation{
    public String trimAndConcat(String str1, String str2){
        return (str1.trim() + str2.trim());
    }
    
    public Integer getIndexOrNull(String str3, char letter1){
        if(str3.indexOf(letter1) == -1 ){
            return null;
        }
        else {
            return (str3.indexOf(letter1));
        }
    }

    public Integer getIndexOrNull(String str3, String letter1){
        if(str3.indexOf(letter1) == -1 ){
            return null;
        }
        else {
            return (str3.indexOf(letter1));
        }
    }

    public String concatSubstring(String str1, int int1, int int2, String str2){
        return str1.substring(int1, int2) + str2;
    }
}