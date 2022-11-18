// Write a C program to print Largest and Smallest Word from a given sentence. 
// If there are two or more words of same length then the first one is considered.Here single letter such as "I" , "a" is considered as a word.

#include<stdio.h>
#include<string.h>

int main()
{
	char string[100] , arr[10][10];
	int  i = 0 , j = 0 , k = 0 , min , max;
	
	printf("Enter the String : ");
	scanf("%[^\n]s" , string);
	
	for(i = 0 ; i < strlen(string)+1 ; i++) 
		if(string[i] == ' '){
			arr[k][j] = '\0';
			j = 0;
			k++;
		}
		else{
			arr[k][j] = string[i];
			j++;
		}
	
	arr[k][j] = '\0';
	
	max = strlen(arr[0]);
	min = strlen(arr[0]);
	
	for(i = 0 ; i <= k ; i++) 
	{
		if(max < strlen(arr[i]))
			max = i;
		
		if(min > strlen(arr[i]))
			min = i;
	}
	printf("\nLargest word is: %s\nSmallest word is: %s\n" , arr[max] , arr[min]);
	
	return 0;
}