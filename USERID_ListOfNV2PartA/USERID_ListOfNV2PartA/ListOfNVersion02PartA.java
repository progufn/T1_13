/**
 * This class maintains an arbitrary length list of integers.
 * 
 * In this version:
 * 1. The size of the list is fixed after the object is created.
 * 2. The code assumes there is at least one element in the list.
 * 
 * This class introduces the use of loops.
 * 
 * @author Raymond Lister 
 * @version September 2015
 * 
 */
public class ListOfNVersion02PartA
{   
    private int[] list;  // Note: no "= {0, 1, 2, 3}" now

    /**
     * This constructor initializes the list to the same values
     * as in the parameter.
     *
     * @param  element   the initial elements for the list
     */
    public ListOfNVersion02PartA(int [] element)
    {
        // make "list" be an array the same size as "element"
        list = new int[element.length];

        for(int i = 0; i < element.length; i++)
        {
            list[i] = element[i];
        }
        // add whatever code is required to complete the constructor 
    } // constructor ListOfNVersion01Skeleton(int [] element)

    /**
     * @return     the number of elements stored in this list 
     */
    public int getListSize()
    {
        return list.length; // replace "999" with the correct answer

        /* See Nielsen page 85-86,
         * section 4.2.3 Retrieving the size of arrays: length
         * 
         * See Parsons page 45,
         * section 3.3.4 The Array “length” Field and also page 47
         */ 
    } // method getListSize

    /**
     * @return     the last element in the list
     */
    public int getLast()
    {
        return list[list.length-1]; // replace "999" with the correct answer

        /* See Nielsen page 85-86,
         * section 4.2.3 Retrieving the size of arrays: length
         * 
         * See Parsons page 45,
         * section 3.3.4 The Array “length” Field and also page 47
         */

    } // method getLast

    /**
     * prints the contents of the list, in order from first to last
     */
    public void printList()
    {
        System.out.print("{"+list[0]);
       
        // add and/or modify code to complete the method 
        for(int i = 1; i < list.length; i++){
            System.out.print(", "+list[i]);
        }

        System.out.print("}");

    } // method printList

    /**
     * This method is NOT examinable in this test.
     * 
     * prints the contents of the list, in order from first to last, and
     * then moves the cursor to the next line
     */
    public void printlnList()
    {
        printList();
        System.out.println();

    } // method printlnList

    /**
     * @return     the number of times the element occurs in the list
     * 
     * @param  element   the element to be counted
     */
    public int countElement(int element)
    {
        // add and/or modify code to complete the method 
        int count = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] == element){
                count++;
            }
        }
        
        return count;

    } // method countElement 

    /**
     * @return     the number of times the replacement was made
     * 
     * @param  replaceThis   the element to be replaced
     * @param  withThis      the replacement
     */
    public int replaceAll(int replaceThis, int withThis)
    {
        // add and/or modify code to complete the method 
        int count = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] == replaceThis){
                count++;
                list[i] = withThis;
            }
        }
        
        return count;

    } // method replaceAll

    /**
     * @return     the first position in list occupied by the parameter value, or -1 if it is not found
     * 
     * @param  findThis   the value to be found
     */
    public int findUnSorted(int findThis)
    {  
        // This algorithm is known as "linear search"
        for(int i = 0; i < list.length; i++){
            if(list[i] == findThis){
                return i;
            }
        }
        
        return -1;
        // add and/or modify code to complete the method 


    } // method findUnSorted 

    /**
     * @return     the position of the smallest element in the array, between positions "first" and "last"
     */
    public int minPos()
    {
        int minpos = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] < list[minpos]){
                minpos = i;
            }
        }
        
        return minpos;


        // add and/or modify code to complete the method 


    } // method minPos
    
    /**
     * Inserts an element in the last position. The elements already in the
     * list are pushed down one place, and the element that was previously
     * first is lost from the list.
     * 
     * @param  newElement   the element to be inserted
     */
    public void insertLast(int newElement)
    {   

        // add and/or modify code to complete the method 
        for(int i = 0; i < list.length-1; i++){
            list[i] = list[i+1];
        }
        list[list.length-1] = newElement;

    } // method insertLast

} // class ListOfNVersion02PartA
