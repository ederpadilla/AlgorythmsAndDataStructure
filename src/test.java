public class test {

    public Character test(String string){
        int [][] englishWords = new int[26][2];
        int size = string.length();
        for (int index =0;index<size;index++){
            englishWords[((string.charAt(index))-97)][1] = index;
            englishWords[((string.charAt(index))-97)][0] += 1;
        }
        int firstDuplicatePos = size;
        for (int index =0;index<26;index++){
            if (englishWords[index][0]==1 &&
                    englishWords[index][1]<firstDuplicatePos){
                firstDuplicatePos = englishWords[index][1];
            }
        }
        if (firstDuplicatePos!=size){
            return string.charAt(englishWords[firstDuplicatePos][1]);
        }else{
            return '_';
        }
    }

    public void test2(){
        int[][] test = new int[10][2];
        test[0][0] = 1;
        test[0][1] = 2;
        System.out.println("the value of "+test[0][0] +" the value of "+test[0][1]);

    }


}