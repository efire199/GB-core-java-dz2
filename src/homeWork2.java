public class homeWork2 {
    public static void main(String[] args) {

        String[][] sArr = {
        {"1" , "2" , "3" , "4"},
        {"1" , "2" , "3" , "4"},
        {"1" , "2" , "3" , "4"},
        {"1" , "2" , "3" , "4"}
        };

        String[][] sArr2 = {
                {"1" , "2" , "3" , "4"},
                {"1" , "2" , "3" , "4"},
                {"1" , "2" , "3" , "4"},
                {"1" , "2" , "3" }
        };

        String[][] sArr3 = {
                {"1" , "2" , "zz" , "4"},
                {"1" , "2" , "3" , "4"},
                {"1" , "2" , "3" , "4"},
                {"1" , "2" , "3" , "4"}
        };

        try {
            System.out.println(checkSumArr(sArr));
            //System.out.println(checkSumArr(sArr2));
            System.out.println(checkSumArr(sArr3));
        }catch (Exception e){
            System.out.println("Какая то оброботка эксепшена " + e);

        }


    }

    public static int  checkSumArr(String[][] arr) throws  MyArraySizeException,MyArrayDataException{
        int sum=0;
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0 ;i< arr.length; i++){
            if (arr[i].length != 4) throw new MyArraySizeException("Неверное количество столбцов");
            for (int j = 0;j< arr[i].length; j++){
                try {
                    sum +=  Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Ошибка в ячейке " + i + j);
                }
            }
        }
        return sum;
    }


    public static class MyArraySizeException extends  Exception {
        public MyArraySizeException(String message){
            super(message);
        }
    }
    public static class MyArrayDataException  extends  Exception {
        public MyArrayDataException (String message){
            super(message);
        }
    }

}
