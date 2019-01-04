#include <stdio.h>

void main(){
    FILE *f1, *f2;

    int c1, c2;

    f1 = fopen("in2.txt", "r");
    if(f1 == NULL)
        printf("Error creating read file\n");

    f2 = fopen("out2.txt", "w");

    c1 = getc(f1);

    while(c1 != EOF){
        if(c1 == '#'){
            while(c1 != '\n')
                c1 = getc(f1);
            putc(c1, f2);
        }
        else{
            break;
        }
        c1 = getc(f1);
    }

    while(c1 != EOF){
        putc(c1, f2);
        c1 = getc(f1);
    }
    fclose(f1);
    fclose(f2);
}



