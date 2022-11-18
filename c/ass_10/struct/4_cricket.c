// Define a structure called cricket that will describe the following information:
// Player name
// Team name
// Batting average
// Using cricket, declare an array player with 50 elements and write a C program to read the
// information about all the 50 players and print team-wise list containing names of players with
// their batting average.

#include <stdio.h>

struct cricket{
	char player_name[20];
	char team_name[20];
	float batting_avg;
};

int main(){
	struct cricket players[50];

	for (int i = 0; i < 3; ++i)
	{
		printf("\nEnter player name  : ");
		scanf(" %[^\n]s", players[i].player_name);
		printf("Enter team name    : ");
		scanf(" %[^\n]s", players[i].team_name);
		printf("Enter batting avg  : ");
		scanf("%f", &players[i].batting_avg);
	}
	printf("\n-------Details-------\n");
	for (int i = 0; i < 3; ++i)
	{
		printf("\nPlayer name  : %s\n", players[i].player_name);
		printf("Team name    : %s\n", players[i].team_name);
		printf("Batting avg  : %.2f\n", players[i].batting_avg);
	}

	return 0;
}