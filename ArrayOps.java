public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{5,3,2,1}));
    }

    public static int findMissingInt (int [] array) {
        for (int i = 0; i <= array.length; i++) {
            boolean found = false;
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length; i++) {
            boolean found = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    found = true;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        int firstDifferent = 0;
        while (array[firstDifferent] == array[firstDifferent+1]) {
            firstDifferent++;
        }
        boolean ole;// what is ole? not meaningful name
        if (array[firstDifferent+1] > array[firstDifferent]) {
            ole = true;
        } else {
            ole = false;
        }
        for (int i = firstDifferent+1; i < array.length -1; i++) {
            if (ole) {
                if (array[i] > array[i+1]) {
                    return false;
                }
            }
            if (!ole) {
                if (array[i] < array[i+1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
