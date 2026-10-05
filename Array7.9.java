

int main()
{
  
    int t[2][3];
    printf("Enter 6 values for the array:\n");

    for (int index = 0; index < 2; index++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("Enter value for t[%d][%d]: ", index, j);
            scanf("%d", &t[index][j]);
        }
    }
    printf("\nElements in row 1:\n");
    printf("%d %d %d\n", t[1][0], t[1][1], t[1][2]);
    printf("\nElements in column 2:\n");
    printf("%d %d\n", t[0][2], t[1][2]);
    t[0][1] = 0;
    printf("\nAfter setting t[0][1] to zero:\n");
    printf("%d %d %d\n", t[0][0], t[0][1], t[0][2]);
    printf("%d %d %d\n", t[1][0], t[1][1], t[1][2]);

    int smallest = t[0][0];

    for (int index = 0; index < 2; index++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (t[index][j] < smallest)
            {
                smallest = t[index][j];
            }
      }
    }

    printf("\nThe smallest value is: %d\n", smallest);
    printf("\nFirst row: %d %d %d\n",
           t[0][0], t[0][1], t[0][2]);

    int total = t[0][2] + t[1][2];

    printf("Total of the third column: %d\n", total);

    printf("\nArray in tabular format:\n");

    printf("     0    1    2\n");

    printf("0    %d    %d    %d\n",
           t[0][0], t[0][1], t[0][2]);

    printf("1    %d    %d    %d\n",
           t[1][0], t[1][1], t[1][2]);

    return 0;
}














