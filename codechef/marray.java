class marray
{
    public static void main(String[] args) {
        int n=10;
        int arr[]={5,6,13,3,2,1,8,11,12,19};
       mergesort(arr,0,n-1);
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
       } 
    }

    public static void mergesort(int[] arr, int low, int high) {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }


    public static void merge(int[] arr, int low, int mid, int high) {
       int i=low;
       int j=mid+1;
       int k=low;
       int xar[]=new int[100];
       while(i<=mid && j<=high)
       {
           if(arr[i]<arr[j])
           {
               xar[k]=arr[i];
               i++;
           }
           else
           {
               xar[k]=arr[j];
               j++;
           }
           k++;
       }
       for(;i<=mid;i++)
       {
           xar[k++]=arr[i];
       }

       for(;j<=high;j++)
       {
           xar[k++]=arr[j];
       }

       for(int p=low;p<=high;p++)
       {
           arr[p]=xar[p];
       }
    }
}