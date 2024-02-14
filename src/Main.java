import javax.lang.model.element.AnnotationValue;

public class Main {
    public static void main(String[] args){
        ////////////////////////////////////////////////////
        System.out.println("Задание 1");
        System.out.println("Часть первая");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        System.out.println("Часть вторая");
        double[] weight = new double []{1.57, 7.654, 9.986};
        System.out.println("Часть третья");
        int[] lesson = new int[10];
        ///////////////////////////////////////////////////
        System.out.println("Задание 2"); // да, знаю ,можно было применить знак != но захотелось так гы
        for (int i = 0; i < first.length; i++){
            if (i == 2) {
                System.out.print(first[i]);
            }else{
                System.out.print(first[i] + ",");
            }
        }
        System.out.println();
        for (int i = 0; i < weight.length; i++) {
            if (i == 2) {
                System.out.print(weight[i]);
            }else{
                System.out.print(weight[i] + ",");
            }
        }
        System.out.println();
        for (int i = 0; i < lesson.length; i++) {
            if (i == 9) {
                System.out.print(lesson[i]);
            }else{
                System.out.print(lesson[i] + ",");
            }
        }
        System.out.println();
        /////////////////////////////////////////////
        System.out.println("Задание 3");
        for (int i = 2; i >= 0; i--){
            if (i == 0) {
                System.out.print(first[i]);
            }else{
                System.out.print(first[i] + ",");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weight[i]);
            }else{
                System.out.print(weight[i] + ",");
            }
        }
        System.out.println();
        for (int i = 9; i>=0 ; i--) {
            if (i == 0) {
                System.out.print(lesson[i]);
            }else{
                System.out.print(lesson[i] + ",");
            }
        }
        System.out.println();
        //////////////////////////////////////////////////
        System.out.println("Задание 4");
        //System.out.println("Задание 1");
        //        System.out.println("Часть первая");
        //        int[] first = new int[3];
        //        first[0] = 1;
        //        first[1] = 2;
        //        first[2] = 3;
        for (int i= 0; i < first.length; i++){
            if (first[i] % 2 == 0){
                System.out.println(first[i]);
            }else {
                System.out.println(first[i] + 1);
            }
        }
    }
}