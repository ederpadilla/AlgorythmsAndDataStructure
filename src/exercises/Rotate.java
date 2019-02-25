package exercises;

public class Rotate {

    public static void main(String[] args){
        int[][] test = new int[3][3];
        test[0][0] = 0;
        test[0][1] = 1;
        test[0][2] = 2;
        test[1][0] = 3;
        test[1][1] = 4;
        test[1][2] = 5;
        test[2][0] = 6;
        test[2][1] = 7;
        test[2][2] = 8;
        int size = test.length;
        int[][] finalArray = new int[3][3];
        for (int i = 0; i<size;i++){
            for (int j = 0 ; j<size; j++){
                int substract = size-j-1;
                finalArray[i][j] = test[substract][i];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i<finalArray.length;i++){
            for (int j = 0 ; j<finalArray[i].length; j++){
                System.out.print(finalArray[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println();
        rotateImage2(test);
    }

    public static int[][] rotateImage2(int[][] test) {
        int size = test.length;
        int[][] finalArray = new int[3][3];
        for (int i = 0; i<size;i++){
            for (int j = 0 ; j<size; j++){
                int substract = size-j-1;
                finalArray[i][j] = test[substract][i];
            }
        }
        for (int i = 0; i<finalArray.length;i++){
            for (int j = 0 ; j<finalArray[i].length; j++){
                System.out.print(finalArray[i][j]+" ");
            }
            System.out.println();
        }
        return finalArray;
    }

}
