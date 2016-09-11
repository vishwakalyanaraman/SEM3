module lab4q1(a,b,d,f);
input a,b,d;
output f;
nor(a1,a,a),(d1,d,d),(b1,b,b);
nor(g,a1,d1),(h,d,b1);
nor(f,g,h);
endmodule
