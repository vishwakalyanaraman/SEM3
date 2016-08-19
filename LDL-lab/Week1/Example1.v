/**** Example 1 **/
module lab1(x1,x2,x3,f);
input x1,x2,x3;
output f;
and(g,x1,x2);
not(h,x2);
and(k,h,x3);
or(f,g,k);
endmodule

//Behavioural 

module lab1(x1,x2,x3,f);
input x1,x2,x3;
output f;
assign f=(x1&x2)|(~x2&x3);
endmodule
