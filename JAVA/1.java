import java.util.Random;

class MainClass {
    public static void shuffleArray(int arr[],int arrLen){
        Random ran=new Random();
        
        for(int i=arrLen-1;i>=0;i--){  //loop to shuffle randomly array elements
            int randomIndex=ran.nextInt(i+1);
            
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int arrLen=arr.length;
        shuffleArray(arr,arrLen); //function for shuffe the array elements
        
        for(int i=0;i<arrLen;i++){ //output after shuffle
            System.out.print(arr[i]+" ");
        }
    }
}