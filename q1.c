#include <stdio.h>

void main(){
    FILE *fa, *fb;
    int ca, cb;
    fa = fopen("in1.c", "r");
    if(fa == NULL)
        printf("Error creating read file\n");

    fb = fopen("out1.c", "w");
    if(fb == NULL)
        printf("Error creating write file");

    ca = getc(fa);
    
    while(ca != EOF){
        if(ca == ' '){ //Single space character
            cb = getc(fa);
            if (cb == ' '){ //Second space character
                putc(ca, fb);
                while(ca != '\n'){
                    ca = getc(fa);
                    putc(ca, fb);
                    break;
                }
            }
            else{
                putc(ca,fb);
                putc(cb, fb);
            }
        }
        else if (ca == '\t'){
            ca = ' ';
            putc(ca, fb);
        }

        else
            putc(ca, fb);
        ca = getc(fa);
    }

    fclose(fa);
    fclose(fb);
}
        //else if (ca == '\t'){

