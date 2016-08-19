/**** Program 1 ****/

module program1(x1,x2,x3,x4,f);
input x1,x2,x3,x4;
output f;
and(a,x1,x3);
and(b,x2,x4);
not(q,x2);
not(w,x3);
or(c,x1,w);
or(d,q,x4);
or(g,a,b);
and(h,c,d);
or(f,g,h);
endmodule

//Behavioural
module program1b(x1,x2,x3,x4,f);
input x1,x2,x3,x4;
output f;
assign f=((x1&x3)|(x2&x4))|((x1|~x3)&(~x2|x4))
endmodule
