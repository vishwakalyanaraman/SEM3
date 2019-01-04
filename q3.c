#include <stdio.h>
#include <string.h>
#include <ctype.h>


void main(){
    
    FILE *f1, *f2;
    int c1, c2;
    
    char *x[5] = {"void", "main", "#include", "printf", "scanf"};
    int lno = 0, cno = 1;
    
    f1 = fopen("in3.c", "r");
    f2 = fopen("out3.c", "w");

    char s[20];

    while(c1 != EOF){
        if (c1 == '\n'){
            lno++;
            cno = 1;
        }
        if (c1 == ' ' || c1 == '\t')
            cno++;

        fscanf(f1, "%s", s);
        for(int i = 0; i < 5; i++){

            if(strcmp(s,x[i]) == 0){
                printf("***Found keyword %s, line: %d, col: %d\n",s, lno, cno);
                int k = 0;
                while(s[k] != '\0'){
                    if (s[k] >= 'a' && s[k] <= 'z') {
                        s[k] = s[k] - 32;
                    }
                    k++;
                }
                break;
                }
        }
        c1 = getc(f1);
        printf("%s\n", s);
    }
}
