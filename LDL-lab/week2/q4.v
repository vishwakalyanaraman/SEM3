module q4(a,b,c,x,y);
input a,b,c;
output x,y;
and(f,a,b),(g,b,c),(h,c,a);
or(x,f,g,h);
nand(i,a,b),(j,b,c),(k,c,a);
nand(y,i,j,k);
endmodule

