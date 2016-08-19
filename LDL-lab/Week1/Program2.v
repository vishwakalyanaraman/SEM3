/*** Program 2 ***/
module program2(x1,x2,x3,f);
input x1,x2,x3;
output f;
not(q,x1);
not(w,x2);
not(e,x3);
or(a,x3,x2,x1);
or(b,x3,w,q);
or(c,x2,q,e);
or(d,w,e,x1);
and(f,a,b,c,d);
endmodule

//Behavioural
module program2b(x1,x2,x3,f);
input x1,x2,x3;
output f;
assign f=(x3|x2|x1)&(x3|~x2|~x1)&(x2|~x1|~x3)&(~x2|~x3|x1);
endmodule
