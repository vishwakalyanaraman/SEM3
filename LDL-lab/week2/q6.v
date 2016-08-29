module q6(x1,x2,x3,a,b);
input x1,x2,x3;
output a,b;
nor(f,x1,x2),(g,x2),(h,x3);
nor(i,g,h);
nor(a,i,f);
nand(j,x1),(k,x3);
nand(l,j,x2),(m,x1,k);
nand(b,l,m);
endmodule
