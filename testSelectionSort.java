import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 4;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 4;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        SelectionSort sortArray = new SelectionSort();
        arr = sortArray.basicSelectionSort(arr);
        assertTrue("The first value within the sorted is 4", arr[0] == Sortedarr[0]);
        assertTrue("The second value within the sorted is 7", arr[1] == Sortedarr[1]);
        assertTrue("The third value within the sorted is 8", arr[2] == Sortedarr[2]);
        assertTrue("The fourth value within the sorted is 9", arr[3] == Sortedarr[3]);
        assertTrue("The fifth value within the sorted is 10", arr[4] == Sortedarr[4]);



    }
    public void testNegative(){

    int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -11;
        arr[4] = -1;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -11;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -1;


        SelectionSort sortArray = new SelectionSort();
        arr = sortArray.basicSelectionSort(arr);
        assertTrue("The first value within the sorted is -11", arr[0] == Sortedarr[0]);
        assertTrue("The second value within the sorted is -9", arr[1] == Sortedarr[1]);
        assertTrue("The third value within the sorted is -8", arr[2] == Sortedarr[2]);
        assertTrue("The fourth value within the sorted is -7", arr[3] == Sortedarr[3]);
        assertTrue("The fifth value within the sorted is -1", arr[4] == Sortedarr[4]);


    }

    public void testMixed(){

    int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -2;
        Sortedarr[2] = 7;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;


        SelectionSort sortArray = new SelectionSort();
        arr = sortArray.basicSelectionSort(arr);
        assertTrue("The first value within the sorted is -8", arr[0] == Sortedarr[0]);
        assertTrue("The second value within the sorted is -2", arr[1] == Sortedarr[1]);
        assertTrue("The third value within the sorted is 7", arr[2] == Sortedarr[2]);
        assertTrue("The fourth value within the sorted is 9", arr[3] == Sortedarr[3]);
        assertTrue("The fifth value within the sorted is 10", arr[4] == Sortedarr[4]);
    }

    public void testDuplicates(){

    int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -8;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 10;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -8;
        Sortedarr[2] = 7;
        Sortedarr[3] = 10;
        Sortedarr[4] = 10;


        SelectionSort sortArray = new SelectionSort();
        arr = sortArray.basicSelectionSort(arr);
        assertTrue("The first value within the sorted is -8", arr[0] == Sortedarr[0]);
        assertTrue("The second value within the sorted is -8", arr[1] == Sortedarr[1]);
        assertTrue("The third value within the sorted is 7", arr[2] == Sortedarr[2]);
        assertTrue("The fourth value within the sorted is 10", arr[3] == Sortedarr[3]);
        assertTrue("The fifth value within the sorted is 10", arr[4] == Sortedarr[4]);
    }
}
