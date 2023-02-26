package icpMIDsem;

public class img1 {
    /*this is answer to 1 question part a 
   
    int a = 5+7-6*8/2%10;
    here accordng to the precidency series of operator *,/,% have same value 
    so we move from left to right.
    so we evaluate -6*8 first 
    this give me a result of -48
    then we evaluate -48/2
    we get -24 as a result 
    then -24%10 which gives -4 as result then we add 5 and 7 
    resulting in 5+7-4=8
    a=8*/
    public static void main(String[] args) {
        int a=5+7-6*8/2%10;
        System.out.println(a);//results in 8

    /*for int b= a+2-9%6/3+(-7)
    first we open the beackets eq becomes a+2-9%6/3-7
    now we follow the precidency series from left to right 
    -9%6=-3
    -3/3=-1
    eq becomes 8+2-1-7=2
    b=2  */
    int b= a+2-9%6/3+(-7);
    System.out.println(b);//b=2
    boolean p=(++a > 61&& --b<13);
    /*++a elads to first incremetn to the the present value of a 
     * it doesnot update the storage value of a its just a temorary
     * +1,
     * here the vaue of a is 8 for that one line of code a becomes 9
     * if it was a++ then teh valeu geta updated after the use of a as 8
     * 
     */
    System.out.println(p);
    /*lastly b>>5
     * its is called binary shift to right by 5 .
     * b=2 
     * we convert b to binary format(010 is binary for 2)
     * first binary shift to right we get 001 
     * then second bunary shift gives 000
     * of we go on with the shife to right we get 000
     * as on has been shifted out of the index box or shifted out of the memory unit  
     *results in 0
     */
    System.out.println(b>>5);//0
    /*This is the solution to 1 part b  
     * 
     * int z=-4
     * int k=z++ + ++z + ++z;
     * this simplifies to -4-2-1=-7
     * ++z means instant update in value 
     * z++ means first use then update   
     */
    int z=-4;
    int k=z++ + ++z + ++z;
       System.out.println(k); //-7
       /*now the value of z = -1 */
    int t=--k + k++ + z++;
       /*-8 -8-1=-17
        * value of z updates to 0
        */
    System.out.println(t);//-17;
    /*value of k = -7 and vaue of z=0 value of t=-17 */
    int p2=t++ - (t%5) + (p2=t);
    /* t%5 = -2 , 
    -17 + -16 - (-1 )
    =-32

     */
    System.out.println(p2);//-32

    }
}
