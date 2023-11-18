package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparseArrayTest {
    @Test
    public void queryString(){
        String [] array = {"ab","ab","abc"};
        String [] queries = {"ab","abc","bc"};
        int [] expected = {2,1,0};
        assertArrayEquals(expected,SparseArray.sparseArrayFunction(array,queries));
    }
    @Test
    public void testAnotherQueryString(){
        String [] array = {"aba","baba","aba","xzxb"};
        String [] queries = {"aba","xzxb","ab"};
        int [] expected = {2,1,0};
        assertArrayEquals(expected,SparseArray.sparseArrayFunction(array,queries));
    }
    @Test
    public void testAnotherInput(){
        String [] array = {"def","de","fgh"};
        String [] queries = {"de","lmn","fgh"};
        int [] expected = {1,0,1};
        assertArrayEquals(expected,SparseArray.sparseArrayFunction(array,queries));
    }
    @Test
    public void testInput(){
        String [] array = {"abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf"};
        String [] queries = {"abcde","sdaklfj", "asdjf", "na","basdn"};
        int [] expected = {1 ,3 ,4 ,3 ,2};
        assertArrayEquals(expected,SparseArray.sparseArrayFunction(array,queries));
    }



}