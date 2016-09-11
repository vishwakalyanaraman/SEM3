module q5(x,y,z,a,b);
input x,y,z;
output a,b;
nand(g,y),(h,z);
nand(i,x,h);
nand(a,i,g);
nor(k,z);
nor(j,x,y);
nor(l,k,y);
nor(b,l,j);
endmodule
