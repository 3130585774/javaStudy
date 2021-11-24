import  java.util.Scanner;
public class guessNum{

	//final static int Size = 4
	//main: entrance of function
	public static void main(String[] args) {

		try{
		    final int SIZE = 4;
		    //int iTemp;
		    //iTemp = (int)( Math.random()*100+1 );//[[1,100]
		    //System.out.println( "iTemp =" + iTemp);

		    int[] iArray = new int[SIZE];
		    for(int i = 0;i<SIZE;i++){
			    iArray[i] = 50;//(int)( Math.random()*100+1);
		    }

		    for(int i = 0;i<SIZE;i++){
			    System.out.print(iArray[i]+" ");
	            }
		    System.out.print(" ");

		    //Friendly tips
		    
		    Scanner sc = new Scanner(System.in);

		    boolean bIs = true;

		    while(bIs){
			    System.out.print("Please input a Int; ");
			    int iInput = sc.nextInt();

			    int i = 0;
			    int iCount = 0;
			    while(i<SIZE){
				    if( iInput == iArray[i] ){
					    System.out.println("find" + i +" in the Array " + iArray[i] );
					    iCount++;
					    bIs = false;
				    }
				    i++;
			    }
			    System.out.println( iInput + " appear " + iCount );

		}

	}finally{
		//System.out.println("This is finally");
	}
    }
}

							    

							    
			   
			   

