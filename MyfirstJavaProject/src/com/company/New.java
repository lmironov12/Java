package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class New {
    public static void main(String[] args) {
        int[] array = {5, 5, 5, 5};
        int result = 0;
        int i = 0;
        int sum = 0;

//            for(int i = 0; i < array.length; i++) {
//            result = result + array[i];
//        }
//        System.out.println(result);

//        while(true) {
//            sum += array[i];
//            i++;
//            if (i > array.length - 1){
//                break;
//            }
//        }
//            System.out.println(sum);
//            }

//        for (int element : array) {
//            sum += element;
//        }
//        System.out.println(sum);
//    }
//}

//        IntStream elements = IntStream.of(array);
//        sum = elements.sum();
//        System.out.println(sum);
//    }
//}

        sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }
}