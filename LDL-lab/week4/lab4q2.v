module lab4q2(a,b,d,f);
input a,b,d;
output f;
nand(b1,b);
nand(g,a,b1);
nand(f,g,d);
endmodule
